
package com.software7.lirica.models;

import java.util.List;

public class Body {

    private List<TrackList> track_list = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Body() {
    }


    public Body(List<TrackList> track_list) {
        super();
        this.track_list = track_list;
    }

    public List<TrackList> getTrack_list() {
        return track_list;
    }

    public void setTrack_list(List<TrackList> track_list) {
        this.track_list = track_list;
    }

}
