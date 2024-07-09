package br.com.ufape.agiota.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EmailInvalidoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

    public EmailInvalidoException(String mensagem) {
        super(mensagem);
    }
    
}
