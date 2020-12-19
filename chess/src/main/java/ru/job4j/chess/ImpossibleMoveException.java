package ru.job4j.chess;

public class ImpossibleMoveException extends Exception {
    private String message;

    public ImpossibleMoveException(String message) {
        super(message);
    }
}
