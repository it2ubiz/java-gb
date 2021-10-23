package ru.geekbrains.lesson1;


public class Dog extends Animal {
    private static int dogCount =0;
    public  Dog(String _name){
        super.Animal(_name);
        this.max_distance = 500;
        this.max_swim = 50;
        this.dogCount++;
        System.out.println("Собак создано: " +this.dogCount);

    }
}