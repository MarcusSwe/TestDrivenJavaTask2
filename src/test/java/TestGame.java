import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.*;
public class TestGame {

    @Test
    public void testGame() {
        UserInput userinput = mock(UserInput.class);
        GetHand computerHand = mock(GetHand.class);
        GetWinner winner = mock(GetWinner.class);

        when(userinput.userInput()).thenReturn("ROCK");
        when(computerHand.giveRandom()).thenReturn("PAPER");
        when(winner.playerOneResults(anyString(),anyString())).thenReturn("DRAW");

        Game game = new Game(userinput, computerHand, winner);

        verify(userinput, times(3)).userInput();
        verify(computerHand, times(3)).giveRandom();
        verify(winner, times(3));

        assertEquals("You won!", game.whoWon(1));
        assertEquals("Its a draw!", game.whoWon(0));
        assertEquals("Computer won!", game.whoWon(-1));
    }
}




