package com.techelevator;

public abstract class Wall {
    //Properties
    private String name;
    private String color;

    //Constructor
    public Wall(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //Methods
    public abstract int getArea();

    //Getters

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    //Setters non because its read only

}
