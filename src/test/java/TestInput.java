import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestInput {

    @Test
    public void testRockInput(){
        assertTrue(CheckInput.userInput("ROCK"));
    }

    @Test
    public void testScissorsInput(){
        assertTrue(CheckInput.userInput("SCISSORS"));
    }

    @Test
    public void testPaperInput(){
        assertTrue(CheckInput.userInput("PAPER"));
    }

    @Test
    public void testWrongInput(){
        assertFalse(CheckInput.userInput("dfgdsgPER"));
    }

}
