package io.gulfbit.recipe.recipeapp.service;

import io.gulfbit.recipe.recipeapp.data.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
