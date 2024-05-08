package com.customer.exception;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class InfyBankException extends Exception {
	private static final long serialVersionUID = 1L;
	public InfyBankException(String message) {
		super(message);
	}
	
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public ResponseEntity<ErrorInfo> exceptionHandler(MethodArgumentNotValidException exception) {
//			ErrorInfo errorInfo = new ErrorInfo();
//			errorInfo.setErrorCode(HttpStatus.BAD_REQUEST.value());
//		    errorInfo.setTimestamp(LocalDateTime.now());
//			
//			String errorMsg = exception.getBindingResult().getAllErrors().stream().map(x -> x.getDefaultMessage())
//					.collect(Collectors.joining(", "));
//			errorInfo.setErrorMessage(errorMsg);
//		
//			return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
//	}
	    

}
