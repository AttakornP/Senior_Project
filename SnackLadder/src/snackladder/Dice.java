/*
 * Class Dice
 * @Author  52363165 Attakorn  Poonkesorn
 * @Since   2013 April 5
 * @Note    JDK 1.7
 * @Note    NetBeans IDE 7.1.2
 * @Note    Windows7 32 bit
 */
package snackladder;

import java.util.Random;

public class Dice {
    
    /**
     * Random point between 0 and 6
     * @param   -
     * @output  point (int)
     * @test    random_dice() => 1 
     *          random_dice() => 2
     *          random_dice() => 3
     *          random_dice() => 4
     *          random_dice() => 5
     *          random_dice() => 6
     */
    public int random_dice(){
        Random rd = new Random();
        int point = Math.abs(rd.nextInt()%6 +1);
        return point;
    }
    
}
