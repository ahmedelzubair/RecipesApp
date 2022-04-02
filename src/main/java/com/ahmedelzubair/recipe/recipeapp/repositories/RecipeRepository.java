package com.ahmedelzubair.recipe.recipeapp.repositories;

import com.ahmedelzubair.recipe.recipeapp.data.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
