package io.gulfbit.recipe.recipeapp.repositories;

import io.gulfbit.recipe.recipeapp.data.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
