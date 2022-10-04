package br.ucsal.grupo_D.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ucsal.grupo_D.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
