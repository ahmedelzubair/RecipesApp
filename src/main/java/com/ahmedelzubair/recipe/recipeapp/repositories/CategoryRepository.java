package com.ahmedelzubair.recipe.recipeapp.repositories;

import com.ahmedelzubair.recipe.recipeapp.data.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long> {

    Optional<Category> findByDescription(String description);

}
