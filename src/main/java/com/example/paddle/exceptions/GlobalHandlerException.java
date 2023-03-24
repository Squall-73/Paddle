package com.example.paddle.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandlerException {

	@ExceptionHandler(NotNullException.class)
	public ResponseEntity<?> productNotFoundException(Exception e){
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
}