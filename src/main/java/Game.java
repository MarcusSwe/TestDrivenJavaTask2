public class Game {

    private final UserInput userinput;
    private final GetHand computer;
    private final GetWinner winner;

    public void start() {
        int victory = 0;
        int x = 0;

        while (x < 3) {
            String userhand = userinput.userInput();
            String computerHand = computer.giveRandom();

            if(CheckInput.userInput(userhand)){
                System.out.println(computerHand);
                switch(winner.playerOneResults(userhand,computerHand)){
                    case "WIN":
                        victory++;
                        break;
                    case "LOSE":
                        victory--;
                        break;
                    case "DRAW":
                        break;
                }
                x++;
            } else System.out.println("Wrong text input!");
        }
        System.out.println(whoWon(victory));
    }

   public Game(UserInput userinput, GetHand computer, GetWinner winner){
        this.userinput = userinput;
        this.computer = computer;
        this.winner = winner;
        start();
   }

   public String whoWon(int results){
        if(results >0)
            return "You won!";
          else if (results == 0) return "Its a draw!";
             else return "Computer won!";
   }

}
