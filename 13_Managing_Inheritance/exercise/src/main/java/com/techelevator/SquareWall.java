package com.techelevator;

public class SquareWall extends RectangleWall{
//Properties
    private int sideLength;

//Constructor
    public SquareWall(String name, String color, int sideLength) {
        super(name, color);
        this.sideLength = sideLength;
    }
//Methods
@Override
public int getArea() {
    return sideLength * sideLength;
}
    @Override
    public String toString(){
    return getName()+" ("+sideLength+"x"+sideLength+")"+" square";
}
//Getters
    public int getSideLength() {
        return sideLength;
    }
//Setters
    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
}
