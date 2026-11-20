package org.example.activity3;

public class InvalidInputException extends Exception {

    public String getMessage() {
        return "Negative arguments are not allowed";
    }

}
