package com.company;

import javax.swing.*;

public class Horse extends Animal {
    String color;


    public Horse(String nickName, int age, String gender, int weight, String color) {
        super(nickName, age, gender, weight);
        this.color = color;
}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}