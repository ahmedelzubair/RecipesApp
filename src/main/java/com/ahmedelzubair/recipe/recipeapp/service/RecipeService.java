package com.ahmedelzubair.recipe.recipeapp.service;

import com.ahmedelzubair.recipe.recipeapp.data.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
