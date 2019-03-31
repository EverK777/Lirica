
package com.software7.lirica.models;


public class Message {

    private Header header;
    private Body body;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Message() {
    }


    public Message(Header header, Body body) {
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

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

}
