package com.ivanamiranda.storage_api.service

import com.ivanamiranda.storage_api.model.FileMetadata
import com.ivanamiranda.storage_api.repository.FileRepository
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import software.amazon.awssdk.core.sync.RequestBody
import software.amazon.awssdk.services.s3.S3Client
import software.amazon.awssdk.services.s3.model.CreateBucketRequest
import software.amazon.awssdk.services.s3.model.PutObjectRequest
import java.util.*

@Service
class FileService(
    private val s3Client: S3Client,
    private val fileRepository: FileRepository
) {

    private val bucketName = "meu-bucket-projeto"

    fun saveFile(file: MultipartFile): FileMetadata {
        // 1. Criar o bucket se não existir (essencial para o LocalStack)
        try {
            s3Client.createBucket(CreateBucketRequest.builder().bucket(bucketName).build())
        } catch (e: Exception) {
            // Bucket já existe, segue o fluxo
        }

        // 2. Gerar um nome único para o arquivo não sobrescrever outro no S3
        val s3Key = "${UUID.randomUUID()}_${file.originalFilename}"

        // 3. Enviar para a AWS S3
        val putOb = PutObjectRequest.builder()
            .bucket(bucketName)
            .key(s3Key)
            .contentType(file.contentType)
            .build()

        s3Client.putObject(putOb, RequestBody.fromBytes(file.bytes))

        // 4. Salvar os metadados no Postgres
        val metadata = FileMetadata(
            fileName = file.originalFilename ?: "unknown",
            fileType = file.contentType ?: "application/octet-stream",
            s3Key = s3Key
        )

        return fileRepository.save(metadata)
    }
}