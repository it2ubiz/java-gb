package ru.geekbrains.lesson1;

public abstract class Animal {
    private String name;
    protected int max_distance;
    protected int max_swim;
    private static int animalCount =0;
    public void Animal(String _name){
        this.name = _name;
        System.out.println("Животное: "+this.name+" создано");
        this.animalCount++;
        System.out.println("Всего животных создано " + this.animalCount);
    }

    public void run(int distance){
        if (distance<=this.max_distance)
            System.out.println(this.name+ " пробежал "+distance+ " метров");
        else
            System.out.println("Животное " + this.name + " может пробежать максимум "+ this.max_distance+ " метров");
    }
    public void swim(int distance){
        if (this.max_swim > 0) {
            if (distance <= this.max_swim)
                System.out.println(this.name + " проплыл " + distance + " метров");
            else
                System.out.println("Животное " + this.name + " может проплыть максимум " + this.max_swim + " метров");
        }
        else
            System.out.println("Животное "+this.name+" не умеет плавать");
    }
}