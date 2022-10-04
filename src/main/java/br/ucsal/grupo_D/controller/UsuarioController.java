package br.ucsal.grupo_D.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ucsal.grupo_D.exception.NegocioException;
import br.ucsal.grupo_D.service.UsuarioService;
import br.ucsal.grupo_D.to.RegistraUsuarioRequest;
import br.ucsal.grupo_D.util.Constantes;

@Controller
@RequestMapping("api/v1/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService; 
	
	@SuppressWarnings("rawtypes")
	@PostMapping(value = "/registrar",
			consumes = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity registrarUsuario(@RequestBody RegistraUsuarioRequest request) {
        ResponseEntity responseEntity = null;
        try {
            responseEntity = ResponseEntity.ok("OK!");
        /*} catch (NegocioException e) {
        	responseEntity = ResponseEntity
                    .status(e.getHttpStatus())
                    .body(e.getMensagem());
			*/
		} catch(RuntimeException e){
            responseEntity = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Constantes.ERRO_INTERNO_SERVIDOR);
		}

        return responseEntity;
    }
	
	@SuppressWarnings("rawtypes")
	@GetMapping(value = "/obter-todos",
            produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity obterTodosUsuarios() {
        ResponseEntity responseEntity = null;
        try {
            responseEntity = ResponseEntity.ok(usuarioService.obterTodosUsuarios());
        } catch (NegocioException e) {
        	responseEntity = ResponseEntity
                    .status(e.getHttpStatus())
                    .body(e.getMensagem());
			
		} catch(RuntimeException e){
            responseEntity = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Constantes.ERRO_INTERNO_SERVIDOR);
		}

        return responseEntity;
    }


}
