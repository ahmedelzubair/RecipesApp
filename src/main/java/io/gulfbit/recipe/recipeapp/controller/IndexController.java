package io.gulfbit.recipe.recipeapp.controller;

import io.gulfbit.recipe.recipeapp.data.Recipe;
import io.gulfbit.recipe.recipeapp.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class IndexController{

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/recipes/all")
    public Set<Recipe> getRecipes(){
       return recipeService.getRecipes();
    }


}
