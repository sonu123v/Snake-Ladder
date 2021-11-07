package day_4;

public class SnakeLadder {
    public static void main(String[] args) {

        System.out.println("Welcome to the Snake and Ladder Game");
        int position=0;
        System.out.println("The position of The player is:"+position);
        int dieCheck =((int)(Math.random()*10)%6)+1;
        System.out.println("The random on die is:" +dieCheck);

    }
}
