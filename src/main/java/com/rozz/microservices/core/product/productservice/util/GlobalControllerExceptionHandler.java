package com.rozz.microservices.core.product.productservice.util;


import com.rozz.microservices.core.product.productservice.exceptions.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    private static final Logger  LOG =LoggerFactory.getLogger(GlobalControllerExceptionHandler.class);

//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @ExceptionHandler(NotFoundException.class)
//    public @ResponseBody HttpErrorInfo
}
