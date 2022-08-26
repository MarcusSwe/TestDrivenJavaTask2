public class GetWinner {

    public String playerOneResults(String playerOne, String playerTwo){

        switch(playerOne+playerTwo) {
            case "ROCKROCK":
                return "DRAW";
            case "ROCKPAPER":
                return "LOSE";
            case "ROCKSCISSORS":
                return "WIN";
            case "PAPERROCK":
                return "WIN";
            case "PAPERPAPER":
                return "DRAW";
            case "PAPERSCISSORS":
                return "LOSE";
            case "SCISSORSROCK":
                return "LOSE";
            case "SCISSORSPAPER":
                return "WIN";
            case "SCISSORSSCISSORS":
                return "DRAW";
            default:
                return "DRAW";
        }
    }
}
