package com.AluraChallenge.ForoHub.domain.usuario;

import jakarta.validation.constraints.NotNull;

public record DatosActualizacionUsuario(
        @NotNull
        Long id,
        String nombre,
        String contrasena,
        Integer perfiles) {
}