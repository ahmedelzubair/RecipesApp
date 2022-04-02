package com.ahmedelzubair.recipe.recipeapp.repositories;

import com.ahmedelzubair.recipe.recipeapp.data.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);

}
