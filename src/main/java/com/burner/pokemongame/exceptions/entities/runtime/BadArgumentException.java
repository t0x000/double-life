package com.burner.pokemongame.exceptions.entities.runtime;

public class BadArgumentException extends GameRuntimeError{
    public BadArgumentException(String message){
        super(message);
    }
    public BadArgumentException(String message, Throwable cause){
        super(message, cause);
    }
}
