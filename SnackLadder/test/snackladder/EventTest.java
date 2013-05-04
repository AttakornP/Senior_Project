/*
 * Class Event Test
 * @Author  52363165 Attakorn  Poonkesorn
 * @Since   2013 April 5
 * @Note    JDK 1.7
 * @Note    NetBeans IDE 7.1.2
 * @Note    Windows7 32 bit
 */
package snackladder;

import org.junit.*;
import static org.junit.Assert.*;
import CoreAsset.Event;
import CoreAsset.Player;
public class EventTest {

    /**
     * @test jump(4, 5) => 5
     */
    @Test
    public void testJump_1() {
        System.out.println("jump");
        Player avatar = new Player();
        avatar.setCurrent_position(4);
        int target = 5;
        Event instance = new Event();
        instance.jump(avatar, target);
        assertEquals(avatar.getCurrent_position(), target);
    }

    /**
     * @test jump(50, 7) => 7
     */
    @Test
    public void testJump_2() {
        System.out.println("jump");
        Player avatar = new Player();
        avatar.setCurrent_position(50);
        int target = 7;
        Event instance = new Event();
        instance.jump(avatar, target);
        assertEquals(avatar.getCurrent_position(), target);
    }

    /**
     * @test move(4, 5) => 9
     */
    @Test
    public void testMove_1() {
        System.out.println("move");
        Player avatar = new Player();
        avatar.setCurrent_position(4);
        int move_point = 5;
        Event instance = new Event();
        instance.move(avatar, move_point);
        assertEquals(avatar.getCurrent_position(), 9);
    }

    /**
     * @test move(50, -17) => 33
     */
    @Test
    public void testMove_2() {
        System.out.println("move");
        Player avatar = new Player();
        avatar.setCurrent_position(50);
        int move_point = -17;
        Event instance = new Event();
        instance.move(avatar, move_point);
        assertEquals(avatar.getCurrent_position(), 33);
    }

    /**
     * @test point(0, 6) => 6
     */
    @Test
    public void testPoint_1() {
        System.out.println("point");
        Player avatar = new Player();
        avatar.setPoint(0);
        int point = 6;
        Event instance = new Event();
        instance.point(avatar, point);
        assertEquals(avatar.getPoint(), 6);
    }
    
    /**
     * @test point(10, -2) => 8
     */
    @Test
    public void testPoint_2() {
        System.out.println("point");
        Player avatar = new Player();
        avatar.setPoint(10);
        int point = -2;
        Event instance = new Event();
        instance.point(avatar, point);
        assertEquals(avatar.getPoint(), 8);
    }
}
