package com.example.topsongs.respository;


import com.example.topsongs.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {
    Song getSongByArtistName(String artistName);
}
