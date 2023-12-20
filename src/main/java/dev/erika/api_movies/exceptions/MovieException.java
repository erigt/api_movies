package dev.erika.api_movies.exceptions;

public class MovieException extends RuntimeException {

    public MovieException(String message) {
        super(message);
    }

    public MovieException(String message, Throwable cause) {
        super(message, cause);
    }

}

