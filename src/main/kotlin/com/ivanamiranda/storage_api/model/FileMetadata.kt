package com.ivanamiranda.storage_api.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "files")
class FileMetadata(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val fileName: String,

    val fileType: String,

    val s3Key: String, // Nome único do arquivo no S3

    val uploadDate: LocalDateTime = LocalDateTime.now()
)