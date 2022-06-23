package ru.geekbrains.part2;

public class Main {

    public static void main(String[] args)
    {
        Person[] persArray = new Person[10];
        Cat[] catArray = new Cat[10];
        Robot[] robotArray = new Robot[10];
        Sport[] points = new Sport[10];
        for (int i=0;i<10;i++){
            if (i%2==0)
                points[i]=new Sport(i+12,0);
            else
                points[i]=new Sport(0,i+15);
        }

        for (int i=0;i<10;i++) {
            persArray[i] = new Person(i + 10, i + 10);
            catArray[i] = new Cat(i + 11, i + 11);
            robotArray[i] = new Robot(i + 12, i + 12);
            System.out.println("Person " + i + " with skills jumpHeight:" + persArray[i].getJumpHeight() + " RunLenght:" + persArray[i].getRunLength());
            boolean result;
            for (int j = 0; j < 10; j++) {
                System.out.println("Sport item H: " + points[j].getHeight() + " L: " + points[j].getLenght());
                if (j % 2 == 0) {
                    result = persArray[i].jump(points[j]);
                    if (!result)
                        break;
                } else {
                    result = persArray[i].run(points[j]);
                    if (!result)
                        break;
                }
            }
            System.out.println("---------------------");
        }
            for (int i=0;i<10;i++) {
                System.out.println("Cat " + i + " with skills jumpHeight:" + catArray[i].getJumpHeight() + " RunLenght:" + catArray[i].getRunLength());
                boolean result;
                for (int j = 0; j < 10; j++) {
                    System.out.println("Sport item H: " + points[j].getHeight() + " L: " + points[j].getLenght());
                    if (j % 2 == 0) {
                        result = catArray[i].jump(points[j]);
                        if (!result)
                            break;
                    } else {
                        result = catArray[i].run(points[j]);
                        if (!result)
                            break;
                    }
                }
                System.out.println("---------------------");
            }

            for (int i=0;i<10;i++) {
                System.out.println("Robot " + i + " with skills jumpHeight:" + robotArray[i].getJumpHeight() + " RunLenght:" + robotArray[i].getRunLength());
                boolean result;
                for (int j = 0; j < 10; j++) {
                    System.out.println("Sport item H: " + points[j].getHeight() + " L: " + points[j].getLenght());
                    if (j % 2 == 0) {
                        result = robotArray[i].jump(points[j]);
                        if (!result)
                            break;
                    } else {
                        result = robotArray[i].run(points[j]);
                        if (!result)
                            break;
                    }
                }
            }
    }
}
