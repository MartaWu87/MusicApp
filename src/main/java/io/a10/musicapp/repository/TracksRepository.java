package io.a10.musicapp.repository;

import io.a10.musicapp.model.Tracks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TracksRepository extends JpaRepository<Tracks, Long> {
}
