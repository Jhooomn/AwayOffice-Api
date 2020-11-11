/**
 * @author  Muhammad Zubair
 * @version 1.0
 */

package awayoffice.api.auth.application.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.nio.file.AccessDeniedException;


@ControllerAdvice
@RestController
@Slf4j
public class ExceptionHandler extends ResponseEntityExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler({AccessDeniedException.class})
    public final ResponseEntity<String> handleAccessDeniedException(){
        return new ResponseEntity<String>("Access is Denied", HttpStatus.FORBIDDEN);
    }
}
