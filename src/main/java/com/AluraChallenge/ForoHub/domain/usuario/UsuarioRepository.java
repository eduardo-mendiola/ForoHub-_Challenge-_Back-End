package com.AluraChallenge.ForoHub.domain.usuario;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    UserDetails findByEmail(String username);

    Page<Usuario> findAllByActivoTrue(Pageable paginacion);

    @Query("""
            select u.activo
            from Usuario u
            where u.id = :idUsuario
            """)
    Boolean findActivoById(Long idUsuario);
}
