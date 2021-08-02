package com.example.demo_sec.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtProvider {

    static private String secret="secretKey";
    static private long time = 100000000;

    static public String generateToken(String username){
        String token = Jwts
                .builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + time))
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
        return token;
    }

    public static void main(String[] args) {
        System.out.println(generateToken("123"));
    }



}
