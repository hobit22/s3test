package com.practice.s3test.repository;

import com.practice.s3test.domain.GalleryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GalleryRepository extends JpaRepository<GalleryEntity, Long> {
}