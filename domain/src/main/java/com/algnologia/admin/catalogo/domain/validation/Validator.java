package com.algnologia.admin.catalogo.domain.validation;

// Classe pai dos validadores
public abstract class Validator {

    private final ValidationHandler handler;

    protected Validator(ValidationHandler handler) {
        this.handler = handler;
    }

    public abstract void validate();

    protected ValidationHandler validationHandler() {
        return this.handler;
    }
}
