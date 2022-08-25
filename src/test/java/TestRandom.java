import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestRandom {

    String hand = GetHand.giveRandom();

    @Test
    public void testRandomReturn() {
        assertTrue(hand.equals("SCISSORS") || hand.equals("ROCK")
                ||hand.equals("PAPER"));
    }

    /*
    @Test
    public void testRandomReturnTestofTest() {
        assertTrue(hand.equals("SCIiSSORS") || hand.equals("RoOCK")
                || hand.equals("PaAPER"));
    }
    */

}
