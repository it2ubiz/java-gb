package ru.geekbrains.lesson1;

public class CatPlates {
    public static void main(String[] args) {
        Cats[] catsArr = new Cats[10];
        Plate plate= new Plate(100);
        plate.info();
        System.out.println("Cats starts to eat...");
        for (int i=0;i<10;i++)
        {
            catsArr[i] = new Cats("CatName"+i,(i+1)*10);
            catsArr[i].eat(plate);
            catsArr[i].info();
            plate.info();
            System.out.println("---------------");
        }
    }
}
