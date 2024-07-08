package com.AluraChallenge.ForoHub.domain.usuario;

import jakarta.validation.constraints.*;

public record DatosRegistroUsuario(
        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String contrasena,
        @NotNull
        Integer perfiles) {

}
