package edu.wctc.jpalab.entity.recipe;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "photo", schema = "recipe")
public class RecipePhoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "photo_recipe_id")
    private Recipe recipe;

    @Column(name = "photo_filename")
    private String fileName;

    @Column(name = "photo_caption")
    private String caption;

    @Column(name = "photo_datestamp")
    private LocalDateTime dateStamp;

    @Column(name = "photo_visible")
    private String visible;

    public RecipePhoto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public LocalDateTime getDateStamp() {
        return dateStamp;
    }

    public void setDateStamp(LocalDateTime dateStamp) {
        this.dateStamp = dateStamp;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }
}
