package com.practica.exception;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class ModeloNotFoundException extends RuntimeException{

	public   ModeloNotFoundException(String mensaje) {
		super(mensaje);
	}
}
