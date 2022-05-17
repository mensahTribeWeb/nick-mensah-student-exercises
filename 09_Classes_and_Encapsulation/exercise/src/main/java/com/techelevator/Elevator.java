package com.techelevator;

public class Elevator {

    //properties
    private int currentFloor = 1;
    private int numberOfFloors;
    private boolean doorOpen;

//Constructor

public Elevator(int numberOfLevelsAvailable){
   this.numberOfFloors = numberOfLevelsAvailable;
}
//Methods
    public void openDoor(){
    doorOpen = true;
    }
    public void closeDoor(){

    doorOpen = false;
    }
    public void goUp(int desiredFloor){
    if(!doorOpen){
        if (desiredFloor <= numberOfFloors){
            if (desiredFloor > currentFloor){
                currentFloor = desiredFloor;
            }
        }
    }
    }
    public void goDown(int desiredFloor){
    if (doorOpen != true){
       if (desiredFloor >= 1){
           if (desiredFloor < currentFloor){
               currentFloor = desiredFloor;
           }
       }
    }
    }

//Getters
public int getCurrentFloor() {
    return currentFloor;
}

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }
}
