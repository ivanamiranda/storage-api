package com.ivanamiranda.storage_api.controller

import com.ivanamiranda.storage_api.model.FileMetadata
import com.ivanamiranda.storage_api.service.FileService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/api/files")
class FileController(private val fileService: FileService) {

    @PostMapping("/upload")
    fun uploadFile(@RequestParam("file") file: MultipartFile): ResponseEntity<FileMetadata> {
        val savedMetadata = fileService.saveFile(file)
        return ResponseEntity.ok(savedMetadata)
    }
}