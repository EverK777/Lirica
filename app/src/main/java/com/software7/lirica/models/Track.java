
package com.software7.lirica.models;

import java.util.List;

public class Track {

    private int track_id;
    private String track_name;
    private List<Object> track_name_translationList = null;
    private int track_rating;
    private int commontrack_id;
    private int instrumental;
    private int explicit;
    private int has_lyrics;
    private int has_subtitles;
    private int has_richsync;
    private int num_favourite;
    private int album_id;
    private String album_name;
    private int artist_id;
    private String artist_name;
    private String track_share_url;
    private String track_edit_url;
    private int restricted;
    private String updated_time;
    private PrimaryGenres primary_genres;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Track() {
    }


    public Track(int trackId, String trackName, List<Object> trackNameTranslationList, int trackRating, int commontrackId, int instrumental, int explicit, int hasLyrics, int hasSubtitles, int hasRichsync, int numFavourite, int albumId, String albumName, int artistId, String artistName, String trackShareUrl, String trackEditUrl, int restricted, String updatedTime, PrimaryGenres primaryGenres) {
        super();
        this.track_id = trackId;
        this.track_name = trackName;
        this.track_name_translationList = trackNameTranslationList;
        this.track_rating = trackRating;
        this.commontrack_id = commontrackId;
        this.instrumental = instrumental;
        this.explicit = explicit;
        this.has_lyrics = hasLyrics;
        this.has_subtitles = hasSubtitles;
        this.has_richsync = hasRichsync;
        this.num_favourite = numFavourite;
        this.album_id = albumId;
        this.album_name = albumName;
        this.artist_id = artistId;
        this.artist_name = artistName;
        this.track_share_url = trackShareUrl;
        this.track_edit_url = trackEditUrl;
        this.restricted = restricted;
        this.updated_time = updatedTime;
        this.primary_genres = primaryGenres;
    }

    public int getTrack_id() {
        return track_id;
    }

    public void setTrack_id(int track_id) {
        this.track_id = track_id;
    }

    public String getTrack_name() {
        return track_name;
    }

    public void setTrack_name(String track_name) {
        this.track_name = track_name;
    }

    public List<Object> getTrack_name_translationList() {
        return track_name_translationList;
    }

    public void setTrack_name_translationList(List<Object> track_name_translationList) {
        this.track_name_translationList = track_name_translationList;
    }

    public int getTrackRating() {
        return track_rating;
    }

    public void setTrackRating(int trackRating) {
        this.track_rating = trackRating;
    }

    public int getCommontrack_id() {
        return commontrack_id;
    }

    public void setCommontrack_id(int commontrack_id) {
        this.commontrack_id = commontrack_id;
    }

    public int getInstrumental() {
        return instrumental;
    }

    public void setInstrumental(int instrumental) {
        this.instrumental = instrumental;
    }

    public int getExplicit() {
        return explicit;
    }

    public void setExplicit(int explicit) {
        this.explicit = explicit;
    }

    public int getHas_lyrics() {
        return has_lyrics;
    }

    public void setHas_lyrics(int has_lyrics) {
        this.has_lyrics = has_lyrics;
    }

    public int getHas_subtitles() {
        return has_subtitles;
    }

    public void setHas_subtitles(int has_subtitles) {
        this.has_subtitles = has_subtitles;
    }

    public int getHas_richsync() {
        return has_richsync;
    }

    public void setHas_richsync(int has_richsync) {
        this.has_richsync = has_richsync;
    }

    public int getNum_favourite() {
        return num_favourite;
    }

    public void setNum_favourite(int num_favourite) {
        this.num_favourite = num_favourite;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getTrack_share_url() {
        return track_share_url;
    }

    public void setTrack_share_url(String track_share_url) {
        this.track_share_url = track_share_url;
    }

    public String getTrack_edit_url() {
        return track_edit_url;
    }

    public void setTrack_edit_url(String track_edit_url) {
        this.track_edit_url = track_edit_url;
    }

    public int getRestricted() {
        return restricted;
    }

    public void setRestricted(int restricted) {
        this.restricted = restricted;
    }

    public String getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(String updated_time) {
        this.updated_time = updated_time;
    }

    public PrimaryGenres getPrimary_genres() {
        return primary_genres;
    }

    public void setPrimary_genres(PrimaryGenres primary_genres) {
        this.primary_genres = primary_genres;
    }

}
