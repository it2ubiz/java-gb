package ru.geekbrains.lesson1;

public class Cats {
    private String name;
    private int appetite;
    private boolean nothungry;

    public Cats(String _name, int _appetit){
        this.name=_name;
        this.appetite= _appetit;
        this.nothungry=false;
    }

    public void eat(Plate p) {
        if (p.getFood()>=this.appetite)
        {
            p.decreaseFood(appetite);
            this.nothungry=true;
        }
        else
            System.out.println("For the cat "+this.name+" is not enough eat in plate");
    }
    public void info(){
        System.out.println("Cat name: "+this.name);
        System.out.println("Cat appetit is: "+this.appetite);
        System.out.println("Cat is hungry: "+!this.nothungry);
    }


}
