package com.ahmedelzubair.recipe.recipeapp.controller;

import com.ahmedelzubair.recipe.recipeapp.service.RecipeService;
import com.ahmedelzubair.recipe.recipeapp.data.Recipe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@Slf4j
@RestController
public class IndexController{

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/recipes/all")
    public Set<Recipe> getRecipes(){
        log.debug("the task done");
       return recipeService.getRecipes();
    }


}
