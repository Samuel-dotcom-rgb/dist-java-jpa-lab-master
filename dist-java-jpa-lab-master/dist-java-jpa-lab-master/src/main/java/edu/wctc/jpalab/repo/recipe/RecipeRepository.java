package edu.wctc.jpalab.repo.recipe;

import edu.wctc.jpalab.entity.recipe.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
}
