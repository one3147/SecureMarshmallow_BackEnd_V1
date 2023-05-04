package com.securemarshmallo.securemarshmallo_backend_v1.domain.file.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "file_data")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FileData {
    @Id
    private UUID id;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(nullable = false, length = 20971520)
    private byte[] data;
}
