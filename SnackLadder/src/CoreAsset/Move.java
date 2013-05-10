/*
 * Class Move
 * @Author  52363165 Attakorn  Poonkesorn
 * @Since   2013 April 5
 * @Note    JDK 1.7
 * @Note    NetBeans IDE 7.1.2
 * @Note    Windows7 32 bit
 */
package CoreAsset;


import java.awt.Color;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Move {

    private int min_move;
    private int max_move;

    public int getMin_move() {
        return min_move;
    }

    public int getMax_move() {
        return max_move;
    }

    public Move(int min_move, int max_move) {
        this.min_move = min_move;
        this.max_move = max_move;
    }

    /**
     * Move forward
     *
     * @param   current_position, move_point (int, int) 
     * @output  new_position (int)
     * @test    Move(0, 100) 
     *          move_forward(0, 4) => 4 
     *          move_forward(99, 5) => 99
     *          move_forward(15, 6) => 21
     */
    public int move_forward(int current_position, int point_move) {
        int new_position = current_position + point_move;
        if (new_position > this.max_move) {
            new_position = current_position;
        }
        return new_position;
    }

    /**
     * Move backward
     *
     * @param   current_position, move_point (int, int) 
     * @output  new_position (int)
     * @test    Move(0, 100) 
     *          move_backward(10, 5) => 5
     *          move_backward(3, 6) => 3
     *          move_backward(15, 6) => 9
     */
    public int move_backward(int current_position, int point_move) {
        int new_position = current_position - point_move;
        if (new_position < this.min_move) {
            new_position = current_position;
        }
        return new_position;
    }
    
    /**
     * Check can move??
     *
     */
    public boolean can_move(Player move_player) {
        boolean move = false;
        if (move_player.getMove() > 0) {
            move = true;
        }
        return move;
    }
    
    /**
     * position_move
     *
     */
    public void position_move(JLayeredPane layer_move, JLabel next_position, String[] table, int next_pos) {
        Point next = str_to_point(table[next_pos]);
//        System.out.println("X = " + next.x + "\nY = " + next.y);
        next_position.setLocation(next.x-22,next.y-22);
    }
    
    /**
     * get_location_from_table
     * @param   str_pos String
     * @output  pos (Point)
     * @test    str_to_point("100,200") => Point(100,200)
     *          str_to_point("10,20") => Point(10,20)
     *          str_to_point("0,0") => Point(0,0)
     *
     */
    public Point str_to_point(String str_pos) {
        Point pos = new Point();
        pos.x = Integer.parseInt(str_pos.split(",")[0]);
        pos.y = Integer.parseInt(str_pos.split(",")[1]);
        return pos;
    }
}
