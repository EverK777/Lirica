
package com.software7.lirica.models;


public class MusicGenreList {

    private MusicGenre music_genre;


    public MusicGenreList() {
    }


    public MusicGenreList(MusicGenre musicGenre) {
        super();
        this.music_genre = musicGenre;
    }

    public MusicGenre getMusic_genre() {
        return music_genre;
    }

    public void setMusic_genre(MusicGenre music_genre) {
        this.music_genre = music_genre;
    }

}
