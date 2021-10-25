package ru.geekbrains.lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class XOGame {
    public static final int SIZE =5;
    public static int[][] terminatedLines = new int[3][SIZE];

    public static void main(String[] args) {
        int[][] gPole = generatePole(SIZE,SIZE);
        printPole(SIZE,SIZE, gPole);
        while (checkWin(SIZE,SIZE,gPole)==false) {
            //printPole(4, 4, gPole);
            Scanner console = new Scanner(System.in);
            while(true) {
                int cX = console.nextInt();
                int cY = console.nextInt();
                if (gPole[cX-1][cY-1]==0){
                    gPole[cX-1][cY-1]=1;
                    break;
                }
                else
                    System.out.println("Указанное поле занято. Введите другие координаты");
            }
            printPole(SIZE,SIZE,gPole);
            terminatedLines = checkLines(SIZE,SIZE,gPole);
            gPole = AiTurn(SIZE, SIZE, gPole);
            printPole(SIZE,SIZE,gPole);
        }
    }
    public static  int[][] checkLines(int width,int height, int[][] _pole){
        int[][] arRes = new int [3][width];
        for (int i=0;i<3;i++)
            for (int j=0;j<width;j++)
                arRes[i][j]=1;
        for (int i=0;i<width;i++)
            for (int j = 0; j < height; j++)
                if (_pole[i][j] == 0) {
                    arRes[0][i] = 0;
                    break;
                }

        for (int i=0;i<height;i++)
            for (int j = 0; j < width; j++)
                if (_pole[j][i] == 0) {
                    arRes[1][i] = 0;
                    break;
                }

        for (int i=0;i<height;i++)
            for (int j = 0; j < width; j++) {
                if ((i == j) && (_pole[j][i] == 0)) {
                    arRes[2][0] = 0;
                    break;
                }
                if ((i+j==width-1)&&(_pole[j][i] == 0)) {
                    arRes[2][1] = 0;
                    break;
                }
            }

        return arRes;
    }

    public  static int[][] generatePole(int width,int height){
        int[][] pole = new int[width][height];
        for (int i=0;i<width;i++){
            for (int j=0;j<height;j++){
                pole[i][j] = 0;
            }
        }
        return pole;
    }

    public static void printPole(int width,int height,int[][] _pole){
        for (int i=0;i<width;i++){
            for (int j=0;j<height;j++){
                if (_pole[i][j]==1)
                    System.out.print(" X ");
                if (_pole[i][j]==-1)
                    System.out.print(" O ");
                if (_pole[i][j]==0)
                    System.out.print(" . ");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static boolean checkWin(int width,int height,int[][] _pole){
        boolean result = false;
        int sum = 0;
        //Check lines
        for (int i=0;i<width;i++){
            sum=0;
            for (int j=0;j<height;j++){
                sum+=_pole[i][j];
            }
            if (Math.abs(sum) == width){
                result = true;
                break;
            }
        }
        //Check Rows
        for (int i=0;i<width;i++){
            sum = 0;
            for (int j=0;j<height;j++){
                sum+=_pole[j][i];
            }
            if (Math.abs(sum) == height){
                result = true;
                break;
            }
        }
        //Check diagonal
        int sum2=0;
        sum = 0;
        for (int i=0;i<width;i++){
            for (int j=0;j<height;j++){
                if (i==j){
                    sum+=_pole[i][j];
                }
                if ((i+j==width-1)){
                    sum2+=_pole[i][j];
                }
            }
        }
        if (Math.abs(sum)==height || Math.abs(sum2)==height) {
            result = true;
        }

        return  result;
    }

    public static int[][] AiTurn(int width,int height,int[][] _pole) {
        int sum = 0;
        int max = -height;
        boolean is_row = true;
        int indexMax = 0;

        //Check lines
        for (int i = 0; i < width; i++) {
            if (terminatedLines[0][i]==0) {
                sum = 0;
                for (int j = 0; j < height; j++) {
                    sum += _pole[i][j];
                }
                if (sum > max) {
                    max = sum;
                    indexMax = i;
                }
            }
        }
        //Check Rows
        for (int i = 0; i < height; i++) {
            if (terminatedLines[1][i]==0) {
                sum = 0;
                for (int j = 0; j < width; j++) {
                    sum += _pole[j][i];
                }
                if (sum > max) {
                    max = sum;
                    indexMax = i;
                    is_row = false;
                }
            }
        }
        int sm1 = 0, sm2 = 0;
        if ((terminatedLines[2][0]==0)||(terminatedLines[2][1]==0)) {
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    if (i == j)
                        sm1 += _pole[i][j];
                    if (i + j == width - 1)
                        sm2 += _pole[i][j];
                }
            }
        }
        System.out.println("sm1="+sm1+" sm2="+sm2);
        System.out.println("Max is: "+max+" "+is_row+" "+indexMax);

        if ((sm1 > max) || (sm2 > max)) {
            boolean flag = false;
            for (int i = 0; i < width; i++)
                if (flag) {
                    break;
                }
                else {
                    for (int j = 0; j < height; j++) {
                        if (((i == j) && (sm1 > max)) || ((i + j == height - 1) && (sm2 > max))) {
                            if (_pole[i][j] == 0) {
                                _pole[i][j] = -1;
                                System.out.println("Diagonal "+i + ":" + j);
                                flag = true;
                                break;
                            }
                        }
                    }
                }
        }
        else{
            //Put symbol in pole
            if (is_row == true) {
                for (int i = 0; i < width; i++)
                    if (_pole[indexMax][i] == 0) {
                        _pole[indexMax][i] = -1;
                        System.out.println("Row "+indexMax + ":" + i);
                        break;
                    }
            } else {
                for (int i = 0; i < height; i++)
                    if (_pole[i][indexMax] == 0) {
                        _pole[i][indexMax] = -1;
                        System.out.println("Column "+i + ":" + indexMax);
                        break;
                    }
            }
        }
        return _pole;
    }
}
