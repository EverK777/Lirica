
package com.software7.lirica.models;


public class MessageLyrics {

    private Header header;
    private BodyLyrics body;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MessageLyrics() {
    }


    public MessageLyrics(Header header, BodyLyrics body) {
        super();
        this.header = header;
        this.body = body;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public BodyLyrics getBody() {
        return body;
    }

    public void setBody(BodyLyrics body) {
        this.body = body;
    }

}
