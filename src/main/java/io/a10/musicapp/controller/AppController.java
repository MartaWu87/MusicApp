package io.a10.musicapp.controller;

import io.a10.musicapp.controller.dto.EditionListDto;
import io.a10.musicapp.model.Edition;
import io.a10.musicapp.model.Tracks;
import io.a10.musicapp.repository.TracksRepository;
import io.a10.musicapp.service.MusicAppService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class AppController {

    private final MusicAppService musicAppService;

    @GetMapping("/show/{id}")
    public List<Tracks> findByAlbum(@PathVariable Long id) {
        return musicAppService.findAllByAlbum(id);
    }

    @GetMapping("/albums")
    public List<Edition> getEditionList() {
        return musicAppService.getEditionList();
    }

    @GetMapping("/albums/length")
    public List<EditionListDto> getEditionListDto() {
        return musicAppService.getEditionListDto();
    }
}