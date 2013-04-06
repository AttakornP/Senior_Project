/*
 * Class Move
 * @Author  52363165 Attakorn  Poonkesorn
 * @Since   2013 April 5
 * @Note    JDK 1.7
 * @Note    NetBeans IDE 7.1.2
 * @Note    Windows7 32 bit
 */
package snackladder;

public class Move {

    private int min_move;
    private int max_move;

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
}
