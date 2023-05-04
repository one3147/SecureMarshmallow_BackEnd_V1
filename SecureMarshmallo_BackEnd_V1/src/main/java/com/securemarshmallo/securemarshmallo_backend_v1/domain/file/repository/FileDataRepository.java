package com.securemarshmallo.securemarshmallo_backend_v1.domain.file.repository;

import com.securemarshmallo.securemarshmallo_backend_v1.domain.file.entity.FileData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FileDataRepository extends JpaRepository<FileData, UUID> {
}
