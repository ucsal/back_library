package br.ucsal.grupo_D.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity(name = "ENDERECO")
public class EnderecoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String logradouro;
	
	private String complemento;
	
	private String cep;
	
	private String cidade;
	
	private String bairro;
	
	private String estado;
	
}
