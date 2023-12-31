package com.algnologia.admin.catalogo.domain.exceptions;

import com.algnologia.admin.catalogo.domain.validation.Error;

import java.util.List;

public class DomainException extends RuntimeException {

    private final List<Error> errors;


    private DomainException(final List<Error> anErrors) {
        super("", null, true, false);
        this.errors = anErrors;

    }

    // Factory Method
    public static DomainException with(final List<Error> anErrors) {
        return new DomainException(anErrors);
    }

    public List<Error> getErrors() {
        return errors;
    }
}
