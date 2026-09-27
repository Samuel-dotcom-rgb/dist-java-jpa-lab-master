package edu.wctc.jpalab.entity.recipe;

import jakarta.persistence.*;

@Entity
@Table(name = "chef", schema = "recipe")
public class Chef {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chef_id")
    private Integer id;

    @Column(name = "chef_firstname")
    private String firstName;

    @Column(name = "chef_lastname")
    private String lastName;

    @Column(name = "chef_avatar")
    private String avatar;

    public Chef() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
