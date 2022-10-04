package br.ucsal.grupo_D.to;

import java.util.List;

import lombok.Data;

@Data
public class RegistraUsuarioRequest {
	
	private String nome;
	
	private String matricula;
	
	private String celular;
	
	private String senha;
	
	private String grupo;
	
	private List<RegistraEnderecoRequest> enderecos;

}
