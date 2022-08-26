public class StartGame {
    public static void main(String[] args) {
        UserInput userinput = new UserInput();
        GetHand computer = new GetHand();
        GetWinner checkwinner = new GetWinner();
       Game game = new Game(userinput, computer, checkwinner);
    }
}
