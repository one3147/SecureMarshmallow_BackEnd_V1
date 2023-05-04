package com.securemarshmallo.securemarshmallo_backend_v1.domain.file.entity;

import com.securemarshmallo.securemarshmallo_backend_v1.domain.file.dto.FileDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "file")
@Getter
@Setter
@NoArgsConstructor //매개변수가 없는
@AllArgsConstructor //모든 필드의 매개변수가 있는
public class File {
    @Id
    private UUID id;

    @Column(nullable = false)
    private String fileName;

    @Column(nullable = false)
    private long fileSize;

    @Column(nullable = false)
    private LocalDateTime createAt;

    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted;

    public FileDto toDto() {
        return new FileDto(id, fileName, fileSize, createAt);
    }
}
