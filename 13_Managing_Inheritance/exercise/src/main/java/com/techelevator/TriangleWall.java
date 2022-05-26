package com.techelevator;

public  class  TriangleWall extends Wall {
    //Properties
    private int base;
    private int height;

    //Constructors

    public TriangleWall(String name, String color, int base, int height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    //Methods

    @Override
    public int getArea(){
       return(base*height)/2;
    }
    public String toString(){
        return super.getName() +" ("+base+"x"+height+")"+ " triangle";
    }


    //Getters
    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }
    //Setters non because its read only
}
