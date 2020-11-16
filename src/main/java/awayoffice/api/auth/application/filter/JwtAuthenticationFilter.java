/**
 * @author  Muhammad Zubair
 * @version 1.0
 */

package awayoffice.api.auth.application.filter;

import awayoffice.api.auth.application.dto.UserDTO;
import awayoffice.api.auth.application.service.JWTTokenProvider;
import awayoffice.api.auth.application.service.UserAuthDetailsService;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

@Slf4j
public class JwtAuthenticationFilter extends OncePerRequestFilter {

  @Autowired private JWTTokenProvider tokenProvider;

  @Autowired private UserAuthDetailsService userDetailsService;

  @Override
  protected void doFilterInternal(HttpServletRequest request,
                                  HttpServletResponse response,
                                  FilterChain filterChain)
      throws ServletException, IOException {
    logger.info("Validating Token !!!");
    try {
      String jwt = getJwtFormRequest(request);
      if (StringUtils.hasText(jwt) && tokenProvider.validateToken(jwt)) {
        logger.info("Token is Valid");
        String userNameFromToken = tokenProvider.getUserNameFromToken(jwt);
        UserDTO userDetails =
            userDetailsService.loadUserByUsername(userNameFromToken);
        System.out.println(userDetails.getAuthorities());
        UsernamePasswordAuthenticationToken authenticationToken =
            new UsernamePasswordAuthenticationToken(
                userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(
            authenticationToken);
      }
    } catch (Exception ex) {
      logger.error("Could not set user authentication in security context", ex);
    }

    filterChain.doFilter(request, response);
  }

  private String getJwtFormRequest(HttpServletRequest request) {
    String bearerToken = request.getHeader("Authorization");
    if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
      return bearerToken.substring(7, bearerToken.length());
    }
    return null;
  }
}
