package com.library.springcorexml;

public class Hello {

    private String message;

    public Hello() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void display() {
        System.out.println(message);
    }
}