package com.ivanamiranda.storage_api.repository

import com.ivanamiranda.storage_api.model.FileMetadata
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FileRepository : JpaRepository<FileMetadata, Long>