import java.util.Random;

public class GetHand {

    static String giveRandom(){

        Random rand = new Random();

        switch(rand.nextInt(3)){
            case 0:
                return "SCISSORS";
            case 1:
                return "ROCK";
            case 2:
                return "PAPER";
            default:
                return "SCISSORS";
        }
    }
}
