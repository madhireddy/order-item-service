package com.capgemini.test.orderitem.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.context.request.WebRequest;

//import com.capgemini.test.order.dto.ApiErrorResponse;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ApiErrorResponseExceptionHandler {
	
	private static final String DATE_FORMAT="dd/MM/yyyy HH:mm:ss";
	
	/*@ExceptionHandler({HttpClientErrorException.class, HttpServerErrorException.class})
	public ResponseEntity<ApiErrorResponse> handleHttpClientErrorException(final HttpStatusCodeException ex, final WebRequest request){
		
		ApiErrorResponse error=new Gson().fromJson(ex.getResponseBodyAsString(), ApiErrorResponse.class);
		
		return ResponseEntity.status(ex.getRawStatusCode()).body(error);*/
	}

//