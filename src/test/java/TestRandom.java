import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestRandom {

    GetHand hand = new GetHand();
    String computerhand = hand.giveRandom();

    @Test
    public void testRandomReturn() {
        assertTrue(computerhand.equals("SCISSORS") || computerhand.equals("ROCK")
                ||computerhand.equals("PAPER"));
    }

    @Test
    public void testRandomReturnTestofTest() {
        assertFalse(computerhand.equals("SCIiSSORS") || computerhand.equals("RoOCK")
                || computerhand.equals("PaAPER"));
    }

}
