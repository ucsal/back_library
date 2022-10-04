package br.ucsal.grupo_D.util;

import java.util.List;
import java.util.Objects;

import org.springframework.http.HttpStatus;

import br.ucsal.grupo_D.exception.NegocioException;

public abstract class Validador {
	
	@SuppressWarnings("rawtypes")
	public static void verificarListaNulaOuVazia(List lista) throws NegocioException {
		if(Objects.isNull(lista) || lista.isEmpty()) {
			throw new NegocioException(HttpStatus.NOT_FOUND, "Nenhum registro encontrado!");
		}
	}

}
