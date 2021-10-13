package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.print("Сумма чисел 5 и 12 в диапазоне [10...20] ");
        System.out.println(checkSumm(5,12));
        System.out.print("Число 10 явлется: ");
        System.out.println(checkNum(10,false)==false?"положительным":"отрицательным");
        System.out.print("Число -10: ");
        checkNum(-10,true);
        System.out.println("Функция вывода строки заданное число раз:");
        printString("Hello",5);
        System.out.print("Год 2000 ");
        System.out.println(checkYear(2000)==true?"Високосный":"Невисокосный");
        System.out.print("Год 2001 ");
        System.out.println(checkYear(2001)==true?"Високосный":"Невисокосный");
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

    public static boolean checkSumm(int a,int b)
    {
        int c=a+b;
        boolean rslt = false;
        return(c >=10) && (c<=20);

            rslt=true;
        return rslt;
    }

    public static  boolean checkNum(int number,boolean print)
    {
        boolean res = false;
        String resString;
        if (number>=0)
            res = true;
        if (print == true)
        {
            resString = (res == true)?"Положительное":"Отрицательное";
            System.out.println(resString);
        }
        return !res;
    }

    public static void printString(String str, int num)
    {
        for (int i=0;i<num;i++)
            System.out.println(str);
    }

    public static boolean checkYear(int year)
    {
        boolean flag = false;
        if (year %100==0 && year %400 ==0 )
            flag=true; //Visikos
        else if (year % 4 == 0 && year % 100 > 0)
            flag=true; //Visikos
        else if (year % 100 == 0)
            flag=false; //NotVisikos
        else
            flag=false; //NotVisikos
        return flag;
    }
}
