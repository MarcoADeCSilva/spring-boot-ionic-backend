package com.nelioalves.cursomc.resources.Exceptions;

import java.security.Timestamp;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandle {
	
	@ExceptionHandler(com.nelioalves.cursomc.services.Exceptions.ObjectNotFoundException.class)
	public ResponseEntity<StandardError> ObjectNotFound(com.nelioalves.cursomc.services.Exceptions.ObjectNotFoundException e, HttpServletRequest request){
		
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
}
