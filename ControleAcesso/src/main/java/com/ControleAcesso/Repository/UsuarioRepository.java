package com.ControleAcesso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ControleAcesso.Entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
