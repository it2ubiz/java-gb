package ru.geekbrains.lesson1;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if (food>=n) {
            food -= n;
        }
        else {
            System.out.println("Not enough eat in plate");
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void increaseFood(int n){
        food+=n;
    }

    public int getFood() {
        return food;
    }
}
