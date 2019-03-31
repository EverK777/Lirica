
package com.software7.lirica.models;

import java.util.List;

public class PrimaryGenres {

    private List<MusicGenreList> music_genre_list = null;


    public PrimaryGenres() {
    }


    public PrimaryGenres(List<MusicGenreList> musicGenreList) {
        super();
        this.music_genre_list = musicGenreList;
    }

    public List<MusicGenreList> getMusic_genre_list() {
        return music_genre_list;
    }

    public void setMusic_genre_list(List<MusicGenreList> music_genre_list) {
        this.music_genre_list = music_genre_list;
    }

}
