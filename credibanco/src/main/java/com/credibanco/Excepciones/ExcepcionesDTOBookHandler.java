package com.credibanco.Excepciones;

import com.credibanco.DTOs.DTOResponseBook;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExcepcionesDTOBookHandler {

    @ExceptionHandler
    public ResponseEntity<DTOResponseBook> handlerException(ExcepcionesDTOBook excepcionesDTOBook) {
        DTOResponseBook errorMessage = new DTOResponseBook(HttpStatus.INTERNAL_SERVER_ERROR, excepcionesDTOBook.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
    }
}
