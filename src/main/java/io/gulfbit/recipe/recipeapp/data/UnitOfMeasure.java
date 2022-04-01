package io.gulfbit.recipe.recipeapp.data;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

}
