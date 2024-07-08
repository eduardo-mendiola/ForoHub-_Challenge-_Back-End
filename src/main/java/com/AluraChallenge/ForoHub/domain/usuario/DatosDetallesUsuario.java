package com.AluraChallenge.ForoHub.domain.usuario;


import jakarta.validation.constraints.NotNull;

public record DatosDetallesUsuario(Long id, String nombre, String email, String contrasena, Integer perfiles) {

    public DatosDetallesUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNombre(), usuario.getEmail(), usuario.getContrasena(), usuario.getPerfiles());
    }
}

