package com.techelevator;

public class Airplane {
// properties
    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;

//Constructor
public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats ){
    this.planeNumber = planeNumber;
    this.totalFirstClassSeats = totalFirstClassSeats;
    this.totalCoachSeats = totalCoachSeats;
}
//Methods
    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats){
    if (forFirstClass){
        if (getAvailableFirstClassSeats() >= totalNumberOfSeats){
        bookedFirstClassSeats += totalNumberOfSeats;
        return true;}
        else{return false;}
    }
    else if(!forFirstClass){
        if (getAvailableCoachSeats() >= totalNumberOfSeats){
            bookedCoachSeats += totalNumberOfSeats;
        return true;}
        else{return false;}
    }
        return forFirstClass;
    }
//    Getters
    public String getPlaneNumber(){
    return planeNumber;
    }
    public int getTotalFirstClassSeats(){
    return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }
    public int getAvailableFirstClassSeats(){
        return  totalFirstClassSeats - bookedFirstClassSeats;
    }
    public int getAvailableCoachSeats(){
        return  totalCoachSeats - bookedCoachSeats;
    }
}
