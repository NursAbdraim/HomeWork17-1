package com.company;

import java.lang.reflect.Array;

public class Farm {
    private String address, ownerName;
    private Cow[] cows;
    private Sheep[] sheeps;
    private Horse[] herses;

    public Farm(String address, String ownerName, Sheep[] sheeps, Cow[] cows, Horse[] horses){
        this.address = address;
        this.ownerName = ownerName;
        this.sheeps = sheeps;
        this.cows = cows;
        this.herses = horses;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Horse[] getHerses() {
        return herses;
    }

    public void setHerses(Horse[] herses) {
        this.herses = herses;
    }

    @Override
    public String toString(){
     return "Farm {" +
             "adress: "+address+
             ", owner name: "+ownerName+
             ", cows: "+cows.length+
             ", sheeps: "+sheeps.length+
             ", horses: "+herses.length+
             '}';
    }
}
