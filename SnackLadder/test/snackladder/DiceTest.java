/*
 * Class Dice Test
 * @Author  52363165 Attakorn  Poonkesorn
 * @Since   2013 April 5
 * @Note    JDK 1.7
 * @Note    NetBeans IDE 7.1.2
 * @Note    Windows7 32 bit
 */
package snackladder;

import org.junit.*;
import static org.junit.Assert.*;

public class DiceTest {

    public DiceTest() {
    }

    /**
     * random_dice() > 0 => True
     */
    @Test
    public void testRandom_dice_1() {
        System.out.println("random_dice");
        Dice instance = new Dice();
        int result = instance.random_dice();
        System.out.println("" + result);
        assertTrue(result > 0);
    }

    /**
     * random_dice() < 7 => True
     */
    @Test
    public void testRandom_dice_2() {
        System.out.println("random_dice");
        Dice instance = new Dice();
        int result = instance.random_dice();
        System.out.println("" + result);
        assertTrue(result < 7);
    }
}
