package ru.geekbrains.lesson1;

public class Cat extends Animal {
    private static int catCount =0;
    public  Cat(String _name){
        super.Animal(_name);
        this.max_distance = 200;
        this.max_swim = 0;
        this.catCount++;
        System.out.println("Котов создано: "+this.catCount);
    }
}