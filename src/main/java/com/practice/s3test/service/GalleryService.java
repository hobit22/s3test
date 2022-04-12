package com.practice.s3test.service;

import com.practice.s3test.dto.GalleryDto;
import com.practice.s3test.repository.GalleryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GalleryService {
    private GalleryRepository galleryRepository;

    public void savePost(GalleryDto galleryDto) {
        galleryRepository.save(galleryDto.toEntity());
    }
}