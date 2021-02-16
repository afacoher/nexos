package com.credibanco.DTOs;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class DTOResponseBook implements Serializable {
    private Object response;
    private HttpStatus responseCode;
    private String message;

    public DTOResponseBook() {
    }

    public DTOResponseBook(HttpStatus responseCode, String message) {
        this.responseCode = responseCode;
        this.message = message;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public HttpStatus getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(HttpStatus responseCode) {
        this.responseCode = responseCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
