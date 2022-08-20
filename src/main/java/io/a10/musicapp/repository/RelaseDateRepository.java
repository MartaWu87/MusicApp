package io.a10.musicapp.repository;

import io.a10.musicapp.model.RelaseDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelaseDateRepository extends JpaRepository<RelaseDate, Long> {
}
