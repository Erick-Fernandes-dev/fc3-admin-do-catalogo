package com.algnologia.admin.catalogo.domain.validation;

import java.util.List;

public interface ValidationHandler {

    // Interfaces Fluents
    ValidationHandler append(Error anError);
    ValidationHandler append(ValidationHandler anHandler);

    ValidationHandler validate(Validation aValidation);


    //Implementando uma lista de erros
    List<Error> getErrors();

    // Vai verificar se tem erro ou não
    default boolean hasError() {
        return getErrors() != null && !getErrors().isEmpty();
    }


    public interface Validation {
        void validate();
    }
}
