package br.ucsal.grupo_D.enums;

import lombok.Getter;

@Getter
public enum GrupoEnum {
	
	GESTOR(1, "Gestor"),
	RESPONSAVEL(2, "Responável"),
	COLABORADOR(3, "Colaborador");
	
	private Integer codigo;
	private String descricao;
	
	private GrupoEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
}
