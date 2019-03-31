
package com.software7.lirica.models;


public class Lyrics {

    private int lyrics_id;
    private int explicit;
    private String lyrics_body;
    private String script_tracking_url;
    private String pixel_tracking_url ;
    private String lyrics_copyright;
    private String updated_time;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Lyrics() {
        
    }


    public Lyrics(int lyrics_id, int explicit, String lyricsBody, String scriptTrackingUrl, String pixel_tracking_url , String lyricsCopyright, String updatedTime) {
        super();
        this.lyrics_id = lyrics_id;
        this.explicit = explicit;
        this.lyrics_body = lyricsBody;
        this.script_tracking_url = scriptTrackingUrl;
        this.pixel_tracking_url  = pixel_tracking_url ;
        this.lyrics_copyright = lyricsCopyright;
        this.updated_time = updatedTime;
    }

    public int getLyrics_id() {
        return lyrics_id;
    }

    public void setLyrics_id(int lyrics_id) {
        this.lyrics_id = lyrics_id;
    }

    public int getExplicit() {
        return explicit;
    }

    public void setExplicit(int explicit) {
        this.explicit = explicit;
    }

    public String getLyrics_body() {
        return lyrics_body;
    }

    public void setLyrics_body(String lyrics_body) {
        this.lyrics_body = lyrics_body;
    }

    public String getScriptTrackingUrl() {
        return script_tracking_url;
    }

    public void setScriptTrackingUrl(String scriptTrackingUrl) {
        this.script_tracking_url = scriptTrackingUrl;
    }

    public String getPixelTrackingUrl() {
        return pixel_tracking_url ;
    }

    public void setPixelTrackingUrl(String pixel_tracking_url ) {
        this.pixel_tracking_url  = pixel_tracking_url ;
    }

    public String getLyricsCopyright() {
        return lyrics_copyright;
    }

    public void setLyricsCopyright(String lyricsCopyright) {
        this.lyrics_copyright = lyricsCopyright;
    }

    public String getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(String updated_time) {
        this.updated_time = updated_time;
    }

}
