package com.securemarshmallo.securemarshmallo_backend_v1.domain.file.service;

import com.securemarshmallo.securemarshmallo_backend_v1.domain.file.entity.File;
import com.securemarshmallo.securemarshmallo_backend_v1.domain.file.entity.FileData;
import com.securemarshmallo.securemarshmallo_backend_v1.domain.file.repository.FileDataRepository;
import com.securemarshmallo.securemarshmallo_backend_v1.domain.file.repository.FileRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class FileService {
    private final FileDataRepository fileDataRepository;
    private final FileRepository fileRepository;

    public File uploadFile(MultipartFile file) {
//        if(file.getSize() >= 1024 * 1024 * 8) throw FileIsToBigException()
        var entity = new File(UUID.randomUUID(), file.getName(), file.getSize(), LocalDateTime.now(), false);
        var save = fileRepository.save(entity);
        try {
            log.info("Name of Data: " + file.getSize());
            log.info("Size of Data: " + file.getSize());
            fileDataRepository.save(new FileData(save.getId(), file.getBytes()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return save;
    }

    public byte[] findFile(UUID uuid) {
        return fileDataRepository.findById(uuid).orElseThrow().getData();
    }

    public void deleteFile(UUID id) {
        fileRepository.deleteById(id);
        fileDataRepository.deleteById(id);
    }
}
