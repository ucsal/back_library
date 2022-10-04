package br.ucsal.grupo_D.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ucsal.grupo_D.entity.UsuarioEntity;
import br.ucsal.grupo_D.exception.NegocioException;
import br.ucsal.grupo_D.repository.UsuarioRepository;
import br.ucsal.grupo_D.to.RegistraUsuarioRequest;
import br.ucsal.grupo_D.util.ConverteObjetos;
import br.ucsal.grupo_D.util.Validador;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<UsuarioEntity> obterTodosUsuarios() throws NegocioException{
		
		List<UsuarioEntity> usuarios = usuarioRepository.findAll();
		
		Validador.verificarListaNulaOuVazia(usuarios);
			
		return usuarios;
	}
	
	public void registrarUsuario(RegistraUsuarioRequest request) {
		/*
		usuarioRepository.save(UsuarioEntity.builder()
											.nome(request.getNome())
											.matricula(request.getMatricula())
											.celular(request.getCelular())
											.senha(request.getSenha())
											.grupo(null)
											.enderecos(request.getEnderecos())
											.build());
											*/
		
		ConverteObjetos<RegistraUsuarioRequest, UsuarioEntity> converteObjetos = new ConverteObjetos<RegistraUsuarioRequest, UsuarioEntity>();
		converteObjetos.converter(request, UsuarioEntity.class);
	}

}
