/*
 * Class Test
 * @Author  52363165 Attakorn  Poonkesorn
 * @Since   2013 April 5
 * @Note    JDK 1.7
 * @Note    NetBeans IDE 7.1.2
 * @Note    Windows7 32 bit
 */
package snackladder;

import org.junit.*;
import static org.junit.Assert.*;
import CoreAsset.Move;

public class MoveTest {
    
    /**
     * Move(0, 100) 
     * move_forward(0, 4) => 4
     */
    @Test
    public void testMove_forward_1() {
        System.out.println("can move forward");
        int current_position = 0;
        int point_move = 4;
        Move instance = new Move(0, 100);
        int expResult = 4;
        int result = instance.move_forward(current_position, point_move);
        System.out.println(current_position+" => "+result);
        assertEquals(expResult, result);
    }
    
    /**
     * Move(0, 100) 
     * move_forward(99, 5) => 99
     */
    @Test
    public void testMove_forward_2() {
        System.out.println("can't move forward");
        int current_position = 99;
        int point_move = 5;
        Move instance = new Move(0, 100);
        int expResult = 99;
        int result = instance.move_forward(current_position, point_move);
        System.out.println(current_position+" => "+result);
        assertEquals(expResult, result);
    }

    /**
     * Move(0, 100) 
     * move_backward(10, 5) => 5
     */
    @Test
    public void testMove_backward_1() {
        System.out.println("can move backward");
        int current_position = 10;
        int point_move = 5;
        Move instance = new Move(0, 100);
        int expResult = 5;
        int result = instance.move_backward(current_position, point_move);
        System.out.println(current_position+" => "+result);
        assertEquals(expResult, result);
    }
    
    /**
     * Move(0, 100) 
     * move_backward(3, 6) => 3
     */
    @Test
    public void testMove_backward_2() {
        System.out.println("can't move backward");
        int current_position = 3;
        int point_move = 6;
        Move instance = new Move(0, 100);
        int expResult = 3;
        int result = instance.move_backward(current_position, point_move);
        System.out.println(current_position+" => "+result);
        assertEquals(expResult, result);
    }
}
