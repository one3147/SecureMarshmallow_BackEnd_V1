package com.securemarshmallo.securemarshmallo_backend_v1.domain.file.repository;

import com.securemarshmallo.securemarshmallo_backend_v1.domain.file.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FileRepository extends JpaRepository<File, UUID> {
}
