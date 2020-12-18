/**
 * @author  Muhammad Zubair
 * @version 1.0
 */

package awayoffice.api.auth.application.exception;

import java.nio.file.AccessDeniedException;

import lombok.val;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
@Slf4j
public class ExceptionHandler extends ResponseEntityExceptionHandler {

  @org.springframework.web.bind.annotation.
  ExceptionHandler({AccessDeniedException.class})
  public final ResponseEntity<String> handleAccessDeniedException() {
    val errorMessage = "Access is Denied";
    log.info("[handleAccessDeniedException] ::: {} ::: [handleAccessDeniedException]", errorMessage);
    return new ResponseEntity<String>(errorMessage, HttpStatus.FORBIDDEN);
  }
}
