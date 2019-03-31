
package com.software7.lirica.models;


public class Header {

    private int status_code;
    private double execute_time;
    private int available;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Header() {
    }


    public Header(int statusCode, double executeTime, int available) {
        super();
        this.status_code = statusCode;
        this.execute_time = executeTime;
        this.available = available;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public double getExecute_time() {
        return execute_time;
    }

    public void setExecute_time(double execute_time) {
        this.execute_time = execute_time;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

}
