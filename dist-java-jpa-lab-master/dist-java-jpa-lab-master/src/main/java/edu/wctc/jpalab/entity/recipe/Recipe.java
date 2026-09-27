package edu.wctc.jpalab.entity.recipe;

import jakarta.persistence.*;

@Entity
@Table(name = "recipe", schema = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "recipe_chef_id")
    private Chef chef;

    @Column(name = "recipe_title")
    private String title;

    @Column(name = "recipe_description")
    private String description;

    public Recipe() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
