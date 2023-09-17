package com.InOneService.GoodsDetails.exceptionhandler;

import com.InOneService.GoodsDetails.model.goodsAvailability;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class goodsEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(goodsexceptionhandler.class)
    public ResponseEntity<goodsAvailability> response(goodsexceptionhandler exception){

        return new ResponseEntity<>(new goodsAvailability().builder()
                .errorCode(exception.getErrorCode())
                .message(exception.getMessage())
                .build(), HttpStatus.NOT_FOUND);


    }


}
