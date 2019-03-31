
package com.software7.lirica.models;


public class MusicGenre {

    private int music_genre_id;
    private int music_genre_parent_id;
    private String music_genre_name;
    private String music_genre_name_extended;
    private String music_genre_vanity;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MusicGenre() {
    }


    public MusicGenre(int musicGenreId, int musicGenreParentId, String musicGenreName, String musicGenreNameExtended, String musicGenreVanity) {
        super();
        this.music_genre_id = musicGenreId;
        this.music_genre_parent_id = musicGenreParentId;
        this.music_genre_name = musicGenreName;
        this.music_genre_name_extended = musicGenreNameExtended;
        this.music_genre_vanity = musicGenreVanity;
    }

    public int getMusic_genre_id() {
        return music_genre_id;
    }

    public void setMusic_genre_id(int music_genre_id) {
        this.music_genre_id = music_genre_id;
    }

    public int getMusic_genre_parent_id() {
        return music_genre_parent_id;
    }

    public void setMusic_genre_parent_id(int music_genre_parent_id) {
        this.music_genre_parent_id = music_genre_parent_id;
    }

    public String getMusic_genre_name() {
        return music_genre_name;
    }

    public void setMusic_genre_name(String music_genre_name) {
        this.music_genre_name = music_genre_name;
    }

    public String getMusic_genre_name_extended() {
        return music_genre_name_extended;
    }

    public void setMusic_genre_name_extended(String music_genre_name_extended) {
        this.music_genre_name_extended = music_genre_name_extended;
    }

    public String getMusic_genre_vanity() {
        return music_genre_vanity;
    }

    public void setMusic_genre_vanity(String music_genre_vanity) {
        this.music_genre_vanity = music_genre_vanity;
    }

}
