package com.idp.drinkmanagerrest.model;


import javax.persistence.*;

@Entity

public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int year;
    private String country;
    private String color;
    private String sweetness;
    private int alcohol;
    @Column(name = "drink_type")
    private String drinkType;
    private String strength;
    private String flavor;
    private String region;

    public Drink() {

    }

    public Drink(String name, int year, String country, String color, String sweetness, int alcohol, String drinkType, String strength, String flavor, String region) {
        this.name = name;
        this.year = year;
        this.country = country;
        this.color = color;
        this.sweetness = sweetness;
        this.alcohol = alcohol;
        this.drinkType = drinkType;
        this.strength = strength;
        this.flavor = flavor;
        this.region = region;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSweetness() {
        return sweetness;
    }

    public void setSweetness(String sweetness) {
        this.sweetness = sweetness;
    }

    public int getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(int alcohol) {
        this.alcohol = alcohol;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}