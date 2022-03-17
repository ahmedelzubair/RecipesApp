package io.gulfbit.recipe.recipeapp.repositories;

import io.gulfbit.recipe.recipeapp.data.Category;
import io.gulfbit.recipe.recipeapp.data.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
}
