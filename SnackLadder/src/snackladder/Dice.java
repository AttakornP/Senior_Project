/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snackladder;

import java.util.Random;

/**
 *
 * @author cartoonmed
 */
public class Dice {
    
    public int random_dice(){
        Random rd = new Random();
        int point = Math.abs(rd.nextInt()%6 +1);
        return point;
    }
    
}
