package day_4;

public class SnakeLadder {
    
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args)
    {
        int position = 0;
        int dieCheck;
        int optionCheck;
        while(position<100)
        {
            dieCheck = ((int) ((Math.random())*10)%6)+1;
            optionCheck =(int) ((Math.random())*10)%3;
            switch(optionCheck)
            {
                case NO_PLAY:
                    position=position;
                    break;
                case LADDER:
                    position=position+dieCheck;
                    break;
                default:
                    position=position-dieCheck;
                    if(position<=0)
                    {
                        position=0;
                    }
            }
        }
        System.out.println("The Position is: "+position);
    }
}
