
package com.software7.lirica.models;


public class TrackList {

    private Track track;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TrackList() {
    }

    /**
     * 
     * @param track
     */
    public TrackList(Track track) {
        super();
        this.track = track;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

}
