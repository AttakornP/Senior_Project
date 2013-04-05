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
    
    public int random_dice(){
        Random rd = new Random();
        int point = Math.abs(rd.nextInt()%6 +1);
        return point;
    }
    
}
