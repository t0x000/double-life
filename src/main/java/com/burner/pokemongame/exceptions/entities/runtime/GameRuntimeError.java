package com.burner.pokemongame.exceptions.entities.runtime;

class GameRuntimeError extends RuntimeException{
    public GameRuntimeError(String message){
        super(message);
    }
    public GameRuntimeError(String message, Throwable cause){
        super(message, cause);
    }
}
