package com.example.topsongs.controller;

import com.example.topsongs.entity.Song;
import com.example.topsongs.respository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SongController {
    private final SongRepository songRepository;

    @Autowired
    public SongController(SongRepository songsRepository) {
        this.songRepository = songsRepository;
    }
    @GetMapping("/songs")
    public List<Song> songs() {
        return songRepository.findAll();
    }

    @GetMapping("/songs/{id}")
    public Optional<Song> getSongById(@PathVariable Integer id) {
        return songRepository.findById(id);
    }
}
