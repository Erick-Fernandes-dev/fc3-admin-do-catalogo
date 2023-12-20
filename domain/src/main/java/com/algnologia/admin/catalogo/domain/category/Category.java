package com.algnologia.admin.catalogo.domain.category;
//O instant é baseado num ponto no marco do tempo
// ele calcula o tempo desde o começo, é bem preciso
//UTC - Hora atual
import com.algnologia.admin.catalogo.domain.AggregateRoot;

import java.time.Instant;
import java.util.UUID;

public class Category extends AggregateRoot<CategoryID> {

    private String name;
    private String description;
    private boolean active;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;

    private Category(
                    final CategoryID anId,
                    final String aName,
                    final String aDescription,
                    final boolean isActive,
                    final Instant aCreationDate,
                    final Instant aUpdateDate,
                    final Instant aDeleteDate
    ) {
        super(anId);
        this.name = aName;
        this.description = aDescription;
        this.active = isActive;
        this.createdAt = aCreationDate;
        this.updatedAt = aUpdateDate;
        this.deletedAt = aDeleteDate;
    }

    // Factory
    public static Category newCategory(final String aName, final String aDescription, final boolean aActive) {

        //Gerando um id único randomico
        final var id = UUID.randomUUID().toString();
        final var now = Instant.now();

        return new Category(id, aName, aDescription, aActive, now, now, null);

    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }



    public boolean isActive() {
        return active;
    }


    public Instant getCreatedAt() {
        return createdAt;
    }


    public Instant getUpdatedAt() {
        return updatedAt;
    }


    public Instant getDeletedAt() {
        return deletedAt;
    }

}
