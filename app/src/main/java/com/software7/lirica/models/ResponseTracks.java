
package com.software7.lirica.models;


public class ResponseTracks {

    private Message message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseTracks() {
    }

    /*
     */
    public ResponseTracks(Message message) {
        super();
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

}
