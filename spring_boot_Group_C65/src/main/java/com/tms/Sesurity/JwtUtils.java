package com.tms.Sesurity;


import io.jsonwebtoken.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Date;
@Slf4j
@Component
public class JwtUtils {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expiration;

    public String generateJwtToken(String login) {
        return Jwts.builder()
                .setSubject(login)
                .setExpiration(new Date(new Date().getTime()+ expiration))
                .signWith(SignatureAlgorithm.HS256,secret).compact();
    }

    public Boolean validateToken(String token){
        try {
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            return  true;
        }catch (SignatureException e){
            log.info("Invalid JWT signature."+ e);
        }catch (ExpiredJwtException e){
            log.info("Expired JWT token." + e);
        }catch (UnsupportedJwtException e) {
            log.info("Unsupported JWT token" + e);
        }catch (IllegalArgumentException e){
            log.info("Illegal argument" + e);
        }
        return false;
    }

    public String getTokenFromHttpRequest(HttpServletRequest request) {
        final  String bearerToken = request.getHeader("Authorization");
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer")){
           return bearerToken.substring(7);
        }
        return null;
    }
    public String getLoginFromJwt(String token){
        try {
           return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
        }catch (Exception e){
            log.info("Can't take login from jwt" + e);
        }
        return null;
    }

}
