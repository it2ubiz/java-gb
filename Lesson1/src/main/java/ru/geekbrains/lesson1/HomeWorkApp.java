package ru.geekbrains.lesson1;

import com.sun.java.swing.plaf.windows.resources.windows;

import java.util.Random;
import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        /*PersonWorker[] persArray = new PersonWorker[5];
        for (int i=0;i<5;i++){
            persArray[i] = new PersonWorker("Person_"+i,"Position_"+i, "Phone_number_"+i,"Main"+i+"@corp",i*1024.75,38+i);
        }
        System.out.println("Created elements");
        for (int i=0;i<5;i++){
            System.out.println("Element: "+i);
            persArray[i].print();
            System.out.println();
        }
        System.out.println("Filtered persons with age >40");
        for (int i=0;i<5;i++){
            if (persArray[i].getAge()>=40){
                System.out.println("Element: "+i);
                persArray[i].print();
                System.out.println();
            }
        }*/
        Cat cat1 = new Cat("Том");
        Dog dog1 = new Dog("Бобик");
        cat1.run(100);
        cat1.run(400);
        dog1.run(200);
        cat1.swim(100);
        dog1.swim(10);
        dog1.swim(100);
        Cat[] catAr = new Cat[3];
        Dog[] dogAr = new Dog[3];
        System.out.println("-----------------");
        for (int i=0;i<3;i++){
            catAr[i]=new Cat("Кот"+i);
            dogAr[i]=new Dog("Собак"+i);
        }

    }

    public static void task1Function(int arlen) {
        int[] arRes;
        arRes = new int[arlen];
        Random randNum = new Random();
        for (int i=0;i<arlen;i++)
            if ((randNum.nextInt()%2)==0)
                arRes[i]=0;
            else
                arRes[i]=1;
        System.out.println(Arrays.toString(arRes));
            for (int i=0;i<arlen;i++)
                arRes[i]=(arRes[i]==1)?0:1;
        System.out.println(Arrays.toString(arRes));
    }

    public  static int[] task2Function() {
        int[] resArr;
        resArr = new int[100];
        for (int i=0;i<100;i++){
            resArr[i]=i+1;
        }
        return  resArr;
    }

    public static int[] task3Function() {
        int[] resArray = new int[]{ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(resArray));
        for (int i=0;i<resArray.length;i++)
            resArray[i]=(resArray[i]<=6)?(resArray[i]*6):resArray[i];
        return  resArray;
    }

    public static void fillMatrix(int size) {
        int[][] matrix;
        matrix = new int[size][size];
        for (int i=0;i<size;i++) {
            for (int j = 0; j < size; j++)
                if ((i==j) || (i+j==size-1))
                    matrix[i][j]=1;
                else
                    matrix[i][j]=0;
        }
        for (int i=0;i<size;i++) {
            for (int j=0;j<size;j++)
                System.out.print(" "+matrix[i][j]+" ");
            System.out.println();
        }
    }

    public static void MinMax(int[] inarr){
        int min = inarr[0];
        int max = -1;
        for (int i=0;i<inarr.length;i++){
            if (max<inarr[i])
                max=inarr[i];
            if (min>inarr[i])
                min=inarr[i];
        }
        System.out.println(Arrays.toString(inarr));
        System.out.println("min= "+min+" max= "+max);
    }

    public static int[] fillArray(int len,int val){
        int[] resArr = new int[len];
        for (int i=0;i<len;i++)
            resArr[i]=val;
        return resArr;
    }

    private static int sumArr(int start,int end, int[] arr){
        int rsum=0;
        for (int i=start;i<end;i++)
            rsum+=arr[i];
        return rsum;
    }

    public static boolean findMidPlace(int[] inpArr){
        int curI=1;
        boolean result =false;
        System.out.println(Arrays.toString(inpArr));
        while (curI<inpArr.length){
            int sRight = sumArr(0,curI,inpArr);
            int sLeft = sumArr(curI,inpArr.length,inpArr);
            if (sRight==sLeft) {
                System.out.println(curI-1);
                result = true;
                break;
            }
            curI++;
        }
        return result;
    }

    public static void printThreeWords() {
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
        if ((c >=10)&&(c<=20))
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
