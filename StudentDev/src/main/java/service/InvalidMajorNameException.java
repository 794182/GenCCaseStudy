package service;

public class InvalidMajorNameException extends RuntimeException {

    public InvalidMajorNameException(String message) {super(message);}

    public InvalidMajorNameException(String message, Throwable cause){super(message, cause);}


}
