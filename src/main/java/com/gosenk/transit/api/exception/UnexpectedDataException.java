package com.gosenk.transit.api.exception;

public class UnexpectedDataException extends Exception{

    public UnexpectedDataException(String expected, String received){
        super("Expected: " + expected + "\n" + "Received: " + received);
    }
}
