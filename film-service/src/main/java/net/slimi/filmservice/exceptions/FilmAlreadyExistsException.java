package net.slimi.filmservice.exceptions;

public class FilmAlreadyExistsException extends RuntimeException {
    public FilmAlreadyExistsException(String message) {
        super(message);
    }
}