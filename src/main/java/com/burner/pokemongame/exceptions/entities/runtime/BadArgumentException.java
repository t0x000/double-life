package com.burner.pokemongame.exceptions.entities.runtime;

public class BadArgumentException extends RuntimeException{
  public BadArgumentException(String message){
    super(message);
  }
}
