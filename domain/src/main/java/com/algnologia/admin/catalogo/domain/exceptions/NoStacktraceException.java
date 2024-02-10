package com.algnologia.admin.catalogo.domain.exceptions;

public class NoStacktraceException extends RuntimeException {

    public NoStacktraceException(final String message) {
        this(message, null);
    }

    // Não vai ficar enchendo a stacktrace e nisso numa aplicação de alta performance é
    // muito importante, pq é uma para muito custosa
    public NoStacktraceException(final String message, final Throwable cause) {
        super(message, cause, true, false);
    }
}
