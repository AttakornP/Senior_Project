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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

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
        int point = Math.abs(rd.nextInt()%6)+1;
        return point;
    }
    
    public void set_point_pic(JButton bt_roll_dice, int point){
        Icon pic_point;
        if(point > 0 && point < 7){
             pic_point = new ImageIcon(getClass().getResource("/img/"+point+".jpg"));
        }
        else{
            pic_point = new ImageIcon(getClass().getResource("/img/dice.png"));
        }
        
        bt_roll_dice.setIcon(pic_point);
    }
    
}
