package br.ucsal.grupo_D.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import br.ucsal.grupo_D.enums.GrupoEnum;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity(name = "USUARIO")
public class UsuarioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String matricula;
	
	private String celular;
	
	private String senha;
	
	@Enumerated(EnumType.ORDINAL)
	private GrupoEnum grupo;
	
	@OneToMany
	@JoinColumn(name = "ENDERECO_ID")
	private List<EnderecoEntity> enderecos;

}
