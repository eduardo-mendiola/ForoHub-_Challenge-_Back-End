package com.AluraChallenge.ForoHub.infra.security;

import com.AluraChallenge.ForoHub.domain.usuario.Usuario;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Component
public class TokenService {
    @Value("${api.security.secret}")
    private String apiSecret;

    public String generarToken(Usuario usuario) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(apiSecret);
            return JWT.create()
                    .withIssuer("ForoHub")
                    .withSubject(usuario.getUsername())
                    .withClaim("id", usuario.getId())
                    .withExpiresAt(generarFechaExpiracion())
                    .sign(algorithm);
        } catch (JWTCreationException exception){
            throw new RuntimeException();
        }
    }

    public String getSubject(String token) {
    if (token == null) {
        throw new RuntimeException("Token nulo");
    }
    try {
        Algorithm algorithm = Algorithm.HMAC256(apiSecret); // Validando firma
        DecodedJWT verifier = JWT.require(algorithm)
                .withIssuer("ForoHub")
                .build()
                .verify(token);

        // Verificar si el subject es válido
        String subject = verifier.getSubject();
        if (subject == null) {
            throw new RuntimeException("Subject inválido en el token");
        }
        return subject;
    } catch (JWTVerificationException exception) {
        throw new RuntimeException("Error al verificar el token: " + exception.getMessage());
    }
}


    private Instant generarFechaExpiracion() {
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-05:00"));
    }
}
