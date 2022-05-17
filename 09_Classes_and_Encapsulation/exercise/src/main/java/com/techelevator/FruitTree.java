package com.techelevator;

public class FruitTree {
//properties
   private String typesOfFruit;
   private int piecesOfFruitLeft;

//constructors
public FruitTree(String typesOfFruit, int piecesOfFruitLeft){
       this.typesOfFruit = typesOfFruit;
       this.piecesOfFruitLeft = piecesOfFruitLeft;
}
//Method
public boolean pickFruit(int numberOfPiecesToRemove) {
    if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
        piecesOfFruitLeft -= numberOfPiecesToRemove;
        return true;
    } else {
        return false;
    }
}
//Getters

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    public String getTypeOfFruit() {
        return typesOfFruit;
    }
}
