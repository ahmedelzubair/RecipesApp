package io.gulfbit.recipe.recipeapp.repositories;

import io.gulfbit.recipe.recipeapp.data.Category;
import io.gulfbit.recipe.recipeapp.data.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
