package br.ucsal.grupo_D.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class NegocioException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private HttpStatus httpStatus;
	
	private String mensagem; 
	
	private Throwable throwable;

	public NegocioException(HttpStatus httpStatus, String mensagem, Throwable throwable) {
		super();
		this.httpStatus = httpStatus;
		this.mensagem = mensagem;
		this.throwable = throwable;
	}
	
	public NegocioException(HttpStatus httpStatus, String mensagem) {
		super();
		this.httpStatus = httpStatus;
		this.mensagem = mensagem;
	}

	public NegocioException(Throwable throwable) {
		super();
		this.throwable = throwable;
	}
	
}
