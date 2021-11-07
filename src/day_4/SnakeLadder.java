package day_4;

public class SnakeLadder {


    public static final int NO_Play=0;
    public static final int LADDER=1;
    public static final int SNAKE=2;
    public static void main(String[] args) {

        System.out.println("Welcome to the Snake and Ladder Game");
        int position=0;
        int dieCheck =((int)(Math.random()*10)%6)+1;
        int optionCheck=((int)(Math.random()*10)%3);
        switch (optionCheck)
        {
            case NO_Play:
                position=position;
                break;
            case  LADDER:
                position=position+dieCheck;
                break;
            default:
                position=position-dieCheck;
                if(position<0){
                    position=0;
                }
        }
        System.out.println("The position of The player is:"+position);
    }
}
