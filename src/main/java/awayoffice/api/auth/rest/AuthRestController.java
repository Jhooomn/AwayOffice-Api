package awayoffice.api.auth.rest;

import awayoffice.api.auth.application.dto.JwtRequestDTO;
import awayoffice.api.auth.application.dto.JwtResponseDTO;
import awayoffice.api.auth.application.dto.UserDTO;
import awayoffice.api.auth.application.service.JWTTokenProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/authenticate")
@Slf4j
@CrossOrigin(origins = {"http://localhost:3000", "https://awayoffice.web.app"})

public class AuthRestController {

  @Autowired private AuthenticationManager authenticationManager;

  @Autowired private JWTTokenProvider jwtTokenProvider;

  @PostMapping()
  public ResponseEntity
  authenticateUser(@RequestBody JwtRequestDTO requestDTO) {
    Authentication authentication = authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(requestDTO.getUsername(),
                                                requestDTO.getPassword()));
    String token =
        jwtTokenProvider.generateToken((UserDTO)authentication.getPrincipal());
    log.info("Token Created {}", token);
    return ResponseEntity.ok(new JwtResponseDTO(token));
  }
}
