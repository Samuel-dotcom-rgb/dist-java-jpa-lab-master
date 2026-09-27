package edu.wctc.jpalab.repo.recipe;

import edu.wctc.jpalab.entity.recipe.Chef;
import org.springframework.data.repository.CrudRepository;

public interface ChefRepository extends CrudRepository<Chef, Integer> {
}
