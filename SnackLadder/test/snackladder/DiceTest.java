/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snackladder;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author cartoonmed
 */
public class DiceTest {

    public DiceTest() {
    }

    /**
     * Random point between 0 and 6
     * @param   -
     * @output  point (int)
     * @test    random_dice() > 0 => True
     */
    @Test
    public void testRandom_dice_1() {
        System.out.println("random_dice");
        Dice instance = new Dice();
        int result = instance.random_dice();
        System.out.println(""+result);
        assertTrue(result > 0);
    }

    
    /**
     * Random point between 0 and 6
     * @param   -
     * @output  point (int)
     * @test    random_dice() < 7 => True
     */
    @Test
    public void testRandom_dice_2() {
        System.out.println("random_dice");
        Dice instance = new Dice();
        int result = instance.random_dice();
        System.out.println(""+result);
        assertTrue(result < 7);
    }
}
