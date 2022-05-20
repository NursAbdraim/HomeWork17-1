package com.company;

public abstract class Animal {
    private int weight;
    private int age;
    private String gender;
    private String nickName;

    public Animal(String nickName, int age, String gender, int weight){
        this.nickName = nickName;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
