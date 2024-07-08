package com.AluraChallenge.ForoHub.domain.usuario;

public record DatosListaUsuario(Long id, String nombre, String email, Integer perfiles) {

    public DatosListaUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNombre(), usuario.getEmail(), usuario.getPerfiles());
    }

}
