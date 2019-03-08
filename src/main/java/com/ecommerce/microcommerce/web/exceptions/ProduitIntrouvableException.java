package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProduitIntrouvableException extends RuntimeException {
	private static final long serialVersionUID = -6064636985153560362L;

	public ProduitIntrouvableException(String s) {
		super(s);
	}
}
