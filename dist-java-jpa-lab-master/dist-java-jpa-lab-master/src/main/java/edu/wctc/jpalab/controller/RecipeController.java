package edu.wctc.jpalab.controller;

import edu.wctc.jpalab.entity.recipe.Chef;
import edu.wctc.jpalab.entity.recipe.Recipe;
import edu.wctc.jpalab.entity.recipe.RecipePhoto;
import edu.wctc.jpalab.repo.recipe.ChefRepository;
import edu.wctc.jpalab.repo.recipe.RecipePhotoRepository;
import edu.wctc.jpalab.repo.recipe.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    private final ChefRepository chefRepo;
    private final RecipeRepository recipeRepo;
    private final RecipePhotoRepository photoRepo;

    @Autowired
    public RecipeController(ChefRepository chefRepo, RecipeRepository recipeRepo, RecipePhotoRepository photoRepo) {
        this.chefRepo = chefRepo;
        this.recipeRepo = recipeRepo;
        this.photoRepo = photoRepo;
    }

    @GetMapping("/photos")
    public List<RecipePhoto> getPhotos() {
        List<RecipePhoto> list = new ArrayList<>();
        photoRepo.findAll().forEach(list::add);
        return list;
    }

    @GetMapping("/recipes")
    public List<Recipe> getRecipes() {
        List<Recipe> list = new ArrayList<>();
        recipeRepo.findAll().forEach(list::add);
        return list;
    }


    @GetMapping("/chefs")
    public List<Chef> getChefs() {
        List<Chef> list = new ArrayList<>();
        chefRepo.findAll().forEach(list::add);
        return list;
    }
}
