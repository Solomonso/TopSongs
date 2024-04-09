package com.example.topsongs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "songs")
public class Song {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "trackname")
    private String trackName;
    @Column(name = "artistname")
    private String artistName;
    @Column(name = "genre")
    private String genre;
    @Column(name = "beatsperminute")
    private Integer beatsPerMinute;
    @Column(name = "energy")
    private Integer energy;
    @Column(name = "danceability")
    private Integer danceability;
    @Column(name = "loundnessdb")
    private Integer loudnessDB;
    @Column(name = "liveness")
    private Integer liveNess;
    @Column(name = "valence")
    private Integer valence;
    @Column(name = "length")
    private Integer length;
    @Column(name = "acousticness")
    private Integer acousticness;
    @Column(name = "speechiness")
    private Integer speechiness;
    @Column(name = "popularity")
    private Integer popularity;

    public Song() {

    }

    public Song(Integer id, String trackName, String artistName, String genre, Integer beatsPerMinute, Integer energy, Integer danceability, Integer loudnessDB, Integer liveNess, Integer valence, Integer length, Integer acousticness, Integer speechiness, Integer popularity) {
        this.id = id;
        this.trackName = trackName;
        this.artistName = artistName;
        this.genre = genre;
        this.beatsPerMinute = beatsPerMinute;
        this.energy = energy;
        this.danceability = danceability;
        this.loudnessDB = loudnessDB;
        this.liveNess = liveNess;
        this.valence = valence;
        this.length = length;
        this.acousticness = acousticness;
        this.speechiness = speechiness;
        this.popularity = popularity;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setBeatsPerMinute(Integer beatsPerMinute) {
        this.beatsPerMinute = beatsPerMinute;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public void setDanceability(Integer danceability) {
        this.danceability = danceability;
    }

    public void setLoudnessDB(Integer loudnessDB) {
        this.loudnessDB = loudnessDB;
    }

    public void setLiveNess(Integer liveNess) {
        this.liveNess = liveNess;
    }

    public void setValence(Integer valence) {
        this.valence = valence;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setAcousticness(Integer acousticness) {
        this.acousticness = acousticness;
    }

    public void setSpeechiness(Integer speechiness) {
        this.speechiness = speechiness;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }
}
