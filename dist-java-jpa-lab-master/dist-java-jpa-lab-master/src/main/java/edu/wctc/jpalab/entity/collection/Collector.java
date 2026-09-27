package edu.wctc.jpalab.entity.collection;

import jakarta.persistence.*;

@Entity
@Table(name = "collector", schema = "collection")
public class Collector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "collector_id")
    private Integer id;

    @Column(name = "collector_firstname")
    private String firstName;

    @Column(name = "collector_lastname")
    private String lastName;

    @Column(name = "collector_avatar")
    private String avatar;

    public Collector() {
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
