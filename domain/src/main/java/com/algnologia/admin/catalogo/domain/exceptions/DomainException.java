package com.algnologia.admin.catalogo.domain.exceptions;

import com.algnologia.admin.catalogo.domain.validation.Error;

import java.util.List;

public class DomainException extends NoStacktraceException {

    private final List<Error> errors;


    private DomainException(final String aMessage, final List<Error> anErrors) {
        super("");
        this.errors = anErrors;

    }

    // Factory Method

    //Factore method passando um único erro
    public static DomainException with(final Error anErrors) {
        return new DomainException(anErrors.message(), List.of(anErrors));
    }


    public static DomainException with(final List<Error> anErrors) {
        return new DomainException("", anErrors);
    }

    public List<Error> getErrors() {
        return errors;
    }

    // Checked exceptions -> são obrigadas a implementar um tratamento
    // - Não é recomendado usar

    // runtime -> não precisa de declarações
}
