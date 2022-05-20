package com.company;

public class Main {
    public static void main(String[] args) {

    Sheep[] sheepsArrFarm1 ={new Sheep("Aman", 2, "Male", 47),
            new Sheep("Juman", 3, "Female", 45),
            new Sheep("Jindi", 3, "Male", 55)};

    Cow[] cowsArrFarm1 = { new Cow("Jamilya", 2, "Female", 250),
            new Cow("Kashka", 3, "Female", 260),
            new Cow("Kyzyl", 2, "Male", 300),
            new Cow("Konur", 5, "Male", 290),
            new Cow("Kara", 3, "Male", 450)};

    Horse[] horseArrFarm1 = { new Horse("BTR", 8, "Male", 420, "Black"),
            new Horse("Champion", 5, "Female", 380, "White"),

    };
    Farm farm1 = new Farm("ChongKemin", "Kurban", sheepsArrFarm1, cowsArrFarm1, horseArrFarm1);
        System.out.println(farm1);

    //2nd farm

    Sheep[] sheepsArrFarm2 = {new Sheep("Akkashka", 1, "Female", 30),};
    Cow[] cowsArrFarm2 = {new Cow("AlaBel", 6, "Female", 295)};
    Horse[] horseArrFarm2 = {new Horse("Prado", 7, "Male", 400, "Red")};

        Farm farm2 = new Farm("Borulu", "Kanybek", sheepsArrFarm2, cowsArrFarm2, horseArrFarm2);
        System.out.println(farm2);


    }
}
