package com.oni.QP.security.config;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.security.Key;

@Service
public class JwtService {

    private static final String SECRET_KEY = "404E635266556A5B6E3272367538782F4428472B4B6250645367566B6070";

    public String extractUsername(String jwt) {
        return null;
    }
    
    public Claims extractAllClaims(String token){
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private Key getSignKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return keyBytes.;
    }
}
