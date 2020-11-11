/**
 * @author  Muhammad Zubair
 * @version 1.0
 */

package awayoffice.api.auth.application.service;


import awayoffice.api.auth.application.dto.UserDTO;
import io.jsonwebtoken.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class JWTTokenProvider {

    @Value("${jwt.secret}")
    private String jwtSecret;

    @Value("${jwt.expirationInMs}")
    private int jwtExpirationInMs;

    public String generateToken(UserDTO userDTO){
        List<String> roles = userDTO
                .getAuthorities()
                .stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());

        return Jwts
                .builder()
                .setIssuer("AwayOffice")
                .setSubject(userDTO.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + jwtExpirationInMs * 10000))
                .claim("Roles",roles)
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }

    public boolean validateToken(String jwt){
        try{
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(jwt);
            return true;
        } catch (SignatureException ex){
            log.error("Invalid JWT Signature");
        } catch (MalformedJwtException ex){
            log.error("Invalid JWT Token");
        } catch (UnsupportedJwtException ex){
            log.error("Unsupported JWT Signature");
        } catch (IllegalArgumentException ex){
            log.error("JWT claims string is empty");
        }
        return false;
    }

    public String getUserNameFromToken(String token){
        return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
    }
}
