package com.example.demo.Exception;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String mensaje){
        super(mensaje);
    }
}
