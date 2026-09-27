package edu.wctc.jpalab.repo.recipe;

import edu.wctc.jpalab.entity.recipe.RecipePhoto;
import org.springframework.data.repository.CrudRepository;

public interface RecipePhotoRepository extends CrudRepository<RecipePhoto, Integer> {
}
