package com.demo.app.entity;

import javax.persistence.*;

@Entity
@Table(name="beer_data")
public class BeerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private Float alcoholPercentage;
    private String breweryLocation;
    private String imageLocation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(Float alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public String getBreweryLocation() {
        return breweryLocation;
    }

    public void setBreweryLocation(String breweryLocation) {
        this.breweryLocation = breweryLocation;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }
}
