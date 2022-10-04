package br.ucsal.grupo_D.to;

import lombok.Data;

@Data
public class RegistraEnderecoRequest {
	
	private String logradouro;
	
	private String complemento;
	
	private String cep;
	
	private String cidade;
	
	private String bairro;
	
	private String estado;

}
