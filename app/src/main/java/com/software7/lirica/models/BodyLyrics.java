
package com.software7.lirica.models;


public class BodyLyrics {

    private Lyrics lyrics;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BodyLyrics() {
    }

    /**
     * 
     * @param lyrics
     */
    public BodyLyrics(Lyrics lyrics) {
        super();
        this.lyrics = lyrics;
    }

    public Lyrics getLyrics() {
        return lyrics;
    }

    public void setLyrics(Lyrics lyrics) {
        this.lyrics = lyrics;
    }

}
