package com.securemarshmallo.securemarshmallo_backend_v1.domain.file.controller;

import com.securemarshmallo.securemarshmallo_backend_v1.domain.file.dto.FileDto;
import com.securemarshmallo.securemarshmallo_backend_v1.domain.file.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Controller
@RequestMapping("/api/file")
@RequiredArgsConstructor
public class FileController {
    private final FileService fileService;

    @GetMapping(value = "/{id}", produces = {MediaType.IMAGE_PNG_VALUE, MediaType.IMAGE_JPEG_VALUE})
    public byte[] getFile(@PathVariable String id) {
        return fileService.findFile(UUID.fromString(id));
    }

    @PostMapping("/upload")
    public FileDto upload(@RequestPart MultipartFile file) {
        return fileService.uploadFile(file).toDto();
    }
}
