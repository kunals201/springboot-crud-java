#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.exception;

import java.util.Date;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@RestController
    public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    
    
    @ExceptionHandler(NoSuchElementException.class)
    public final ResponseEntity<ExceptionResponse> handleStudentNotFoundException(NoSuchElementException ex, WebRequest request) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),
                request.getDescription(false));
        
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }
    
}
