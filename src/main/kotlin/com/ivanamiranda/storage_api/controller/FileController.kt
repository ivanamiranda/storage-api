package com.ivanamiranda.storage_api.controller

import com.ivanamiranda.storage_api.model.FileMetadata
import com.ivanamiranda.storage_api.service.FileService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/api/files")
class FileController(
    private val fileService: FileService
) {

    @Operation(summary = "Upload de arquivos")
    @PostMapping(
        "/upload",
        consumes = [MediaType.MULTIPART_FORM_DATA_VALUE]
    )
    fun uploadFile(
        @RequestPart("file")
        file: MultipartFile
    ): ResponseEntity<FileMetadata> {

        val response = fileService.saveFile(file)

        return ResponseEntity.ok(response)
    }
}