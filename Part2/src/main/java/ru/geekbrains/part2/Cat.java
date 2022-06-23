package ru.geekbrains.part2;

public class Cat {
    private int jumpHeight;
    private int runLength;

    Cat(int jH,int rL){
        if (jH!=0)
            this.jumpHeight=jH;
        if (rL!=0)
            this.runLength=rL;
    }

    public int getJumpHeight() {
        return this.jumpHeight;
    }

    public int getRunLength(){
        return this.runLength;
    }

    public boolean run(Sport item){
        if (item.getLenght()<= this.runLength) {
            System.out.println("Is running distance "+item.getLenght());
            return true;
        }
        else {
            System.out.println("Distance:"+item.getLenght()+" is to long to run");
            return false;
        }
    }

    public boolean jump(Sport item){
        if (item.getHeight()<= this.jumpHeight) {
            System.out.println("Is jumping distance "+item.getHeight());
            return true;
        }
        else {
            System.out.println("Distance:"+item.getHeight()+" is to long to jump");
            return false;
        }
    }
}
