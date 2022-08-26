import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCompareHands {

    GetWinner winner = new GetWinner();

    @Test
    public void testScissorsVSScissors(){
        assertEquals("DRAW", winner.playerOneResults("SCISSORS", "SCISSORS"));
    }

    @Test
    public void testScissorsVSRock(){
        assertEquals("LOSE", winner.playerOneResults("SCISSORS", "ROCK"));
    }

    @Test
    public void testScissorsVSPaper(){
        assertEquals("WIN", winner.playerOneResults("SCISSORS", "PAPER"));
    }

    @Test
    public void testRockVSRock(){
        assertEquals("DRAW", winner.playerOneResults("ROCK", "ROCK"));
    }

    @Test
    public void testRockVSPaper(){
        assertEquals("LOSE", winner.playerOneResults("ROCK", "PAPER"));
    }

    @Test
    public void testRockVSScissors(){
        assertEquals("WIN", winner.playerOneResults("ROCK", "SCISSORS"));
    }

    @Test
    public void testPaperVSPaper(){
        assertEquals("DRAW", winner.playerOneResults("PAPER", "PAPER"));
    }

    @Test
    public void testPaperVSRock(){
        assertEquals("WIN", winner.playerOneResults("PAPER", "ROCK"));
    }

    @Test
    public void testPaperVSScissors(){
        assertEquals("LOSE", winner.playerOneResults("PAPER", "SCISSORS"));
    }

    @Test
    public void testWrongInput(){
        assertEquals("DRAW", winner.playerOneResults("PAPsdfER", "SCISdSORS"));
    }

}
