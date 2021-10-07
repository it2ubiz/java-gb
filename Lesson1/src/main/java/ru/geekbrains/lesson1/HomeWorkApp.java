package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println("--==--");
        checkSumSign();
        System.out.println("--==--");
        printColor();
        System.out.println("--==--");
        compareNumbers();
        System.out.println("--==--");
    }

    public static void printThreeWords()
    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign()
    {
        int a = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
        int b = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
        System.out.println("A is "+a);
        System.out.println("B is "+b);
        if ((a+b)>=0)
        {
            System.out.println("Сумма положительная");
        }
        else
            System.out.println("Сумма отрицательная");

    }

    public static void printColor()
    {
        int value = -200 + (int) (Math.random() * ((200 - (-200)) + 1));
        System.out.println("Value is "+value);
        String color="";
        if (value<=0)
            color ="Красный";
        else {
            if ((value > 0)&&(value<=100))
                color = "Желтый";
            if (value>=100)
                color ="Зеленый";
        }
        System.out.println(color);
    }
    public static void compareNumbers()
    {
        int a = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
        int b = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
        System.out.println("A and B is "+a+" "+b);
        if (a>=b)
            System.out.println("a>=b");
        else
            System.out.println("a<b");
    }
}
