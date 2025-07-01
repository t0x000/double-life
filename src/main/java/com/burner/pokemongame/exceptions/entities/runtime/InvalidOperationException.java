package com.burner.pokemongame.exceptions.entities.runtime;

public class InvalidOperationException extends GameRuntimeError{

    public InvalidOperationException(String message){
        super(message);
    }
    public InvalidOperationException(String message, Throwable cause){
        super(message, cause);
    }

}
