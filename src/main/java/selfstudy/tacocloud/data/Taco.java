package selfstudy.tacocloud.data;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
/*
Entities in JPA are nothing but POJOs representing data that can be persisted to the database.
An entity represents a table stored in a database.
Every instance of an entity represents a row in the table.

The entity name defaults to the name of the class. We can change its name using the name element:
@Entity(name = "the name of attribute you want")
 */
@Entity
public class Taco {

    @Id// Each JPA entity must have a primary key that uniquely identifies it. The @Id annotation defines the primary key.
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date createdAt;

    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;

    @ManyToMany(targetEntity = Ingredient.class)
    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;

    @PrePersist
    void createdAt() {
        this.createdAt = new Date();
    }
}
