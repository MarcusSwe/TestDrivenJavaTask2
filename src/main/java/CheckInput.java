public class CheckInput {

    static boolean userInput(String input){
        switch(input) {
            case "ROCK":
                return true;
            case "PAPER":
                return true;
            case "SCISSORS":
                return true;
            default:
                return false;
        }
    }
}
