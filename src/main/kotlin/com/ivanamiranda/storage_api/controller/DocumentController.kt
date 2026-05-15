package com.ivanamiranda.storage_api.controller

import com.ivanamiranda.storage_api.service.StorageService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/api/documents")
class DocumentController(private val storageService: StorageService) {

    @PostMapping("/upload")
    fun uploadFile(@RequestParam("file") file: MultipartFile): ResponseEntity<String> {
        val message = storageService.upload(file.originalFilename ?: "arquivo", file.bytes)
        return ResponseEntity.ok(message)
    }
}