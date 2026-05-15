package com.ivanamiranda.storage_api.service

import org.springframework.stereotype.Service
import software.amazon.awssdk.core.sync.RequestBody
import software.amazon.awssdk.services.s3.S3Client
import software.amazon.awssdk.services.s3.model.CreateBucketRequest
import software.amazon.awssdk.services.s3.model.PutObjectRequest

@Service
class StorageService(private val s3Client: S3Client) {

    private val bucketName = "meu-bucket-projeto"

    fun upload(fileName: String, content: ByteArray): String {
        // Cria o bucket se não existir (apenas para teste local)
        try {
            s3Client.createBucket(CreateBucketRequest.builder().bucket(bucketName).build())
        } catch (e: Exception) { /* bucket já existe */ }

        val putOb = PutObjectRequest.builder()
            .bucket(bucketName)
            .key(fileName)
            .build()

        s3Client.putObject(putOb, RequestBody.fromBytes(content))
        return "Arquivo $fileName enviado com sucesso para o S3!"
    }
}