package io.a10.musicapp.repository;

import io.a10.musicapp.model.Edition;
import io.a10.musicapp.model.Tracks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public interface TracksRepository extends JpaRepository<Tracks, Long> {
    List<Tracks> findByEdition(Edition edition);

    @Query(value = "select sum(length) from tracks where edition_id=?", nativeQuery = true)
    Long countAlbumTime(Long id);

}
