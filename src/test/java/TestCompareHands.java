import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCompareHands {

    @Test
    public void testScissorsVSScissors(){
        assertEquals("DRAW", GetWinner.playerOneResults("SCISSORS", "SCISSORS"));
    }

    @Test
    public void testScissorsVSRock(){
        assertEquals("LOSE", GetWinner.playerOneResults("SCISSORS", "ROCK"));
    }

    @Test
    public void testScissorsVSPaper(){
        assertEquals("WIN", GetWinner.playerOneResults("SCISSORS", "PAPER"));
    }

    @Test
    public void testRockVSRock(){
        assertEquals("DRAW", GetWinner.playerOneResults("ROCK", "ROCK"));
    }

    @Test
    public void testRockVSPaper(){
        assertEquals("LOSE", GetWinner.playerOneResults("ROCK", "PAPER"));
    }

    @Test
    public void testRockVSScissors(){
        assertEquals("WIN", GetWinner.playerOneResults("ROCK", "SCISSORS"));
    }

    @Test
    public void testPaperVSPaper(){
        assertEquals("DRAW", GetWinner.playerOneResults("PAPER", "PAPER"));
    }

    @Test
    public void testPaperVSRock(){
        assertEquals("WIN", GetWinner.playerOneResults("PAPER", "ROCK"));
    }

    @Test
    public void testPaperVSScissors(){
        assertEquals("LOSE", GetWinner.playerOneResults("PAPER", "SCISSORS"));
    }


}
