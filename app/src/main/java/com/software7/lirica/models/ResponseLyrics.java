
package com.software7.lirica.models;


public class ResponseLyrics {

    private MessageLyrics message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseLyrics() {
    }

    public ResponseLyrics(MessageLyrics message) {
        super();
        this.message = message;
    }

    public MessageLyrics getMessage() {
        return message;
    }

    public void setMessage(MessageLyrics message) {
        this.message = message;
    }

}
