package com.algnologia.admin.catalogo.domain;

//Agregado Raiz
public abstract class AggregateRoot<ID extends Identifier> extends Entity<ID> {
    protected AggregateRoot(final ID id) {
        super(id);
    }
}
