package com.techelevator;

public  class RectangleWall extends Wall {
    //Properties
    protected int length;
    protected int height;

    //Constructor

    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }
    protected RectangleWall(String name, String color) {
        super(name,color);
    }
    //Methods
    @Override
    public int getArea() {
        return length * height;
    }
    public String toString(){
        return super.getName() + " ("+length+"x"+height+")"+ " rectangle";
    }
    //Getters

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    //Setters non because its read only
}
