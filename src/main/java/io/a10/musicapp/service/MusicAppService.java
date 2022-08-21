package io.a10.musicapp.service;

import io.a10.musicapp.model.Edition;
import io.a10.musicapp.model.Tracks;
import io.a10.musicapp.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

@Service
@RequiredArgsConstructor
public class MusicAppService {
    private final EditionRepository editionRepository;
    private final TracksRepository tracksRepository;


    public List<Edition> getEditionList() {
        return editionRepository.findAll();
    }

    public List<List<Tracks>> findAllByAlbum(Long id) {
        return editionRepository.findById(id)
                .stream()
                .map(track -> tracksRepository.findAll())
                .collect(Collectors.toList());

    }
//    @Query(value = "select sum(length) from tracks where edition_id=?", nativeQuery = true)
//    Long countAlbumTime(Long id)
}
