/**
 * @author  Muhammad Zubair
 * @version 1.0
 */

package awayoffice.api.auth.application.exception;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class InvalidLoginAttemptHandler implements AuthenticationEntryPoint {

  @Override
  public void commence(HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse,
                       AuthenticationException e)
      throws IOException, ServletException {
    log.info("Invalid Login Attempt !!!");
    httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED,
                                  e.getMessage());
  }
}
