package ru.geekbrains.part2;

public class Sport {
    private int height;
    private int lenght;

    Sport (int iH,int iL){
        if (iH>0)
            this.height=iH;
        if (iL>0)
            this.lenght=iL;
    }
    public int getHeight(){
        return this.height;
    }
    public  int getLenght(){
        return this.lenght;
    }
}
