package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class ProduitGratuitException extends RuntimeException {
	private static final long serialVersionUID = -4352937033973636989L;

	public ProduitGratuitException(final String s) {
		super(s);
	}

	public ProduitGratuitException() {
		super("produit gratuit non accepter!!");
	}
}
