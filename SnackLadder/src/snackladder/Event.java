/*
 * Class Event
 * @Author  52363165 Attakorn  Poonkesorn
 * @Since   2013 April 5
 * @Note    JDK 1.7
 * @Note    NetBeans IDE 7.1.2
 * @Note    Windows7 32 bit
 */
package snackladder;

public class Event {

    /**
     * Jump to position
     * @param avatar
     * @param target 
     */
    public void jump(Player avatar, int target) {
        avatar.setCurrent_position(target);
    }

    /**
     * Move point is increase or decrease
     * @param avatar
     * @param target 
     */
    public void move(Player avatar, int move_point) {
        avatar.setCurrent_position(avatar.getCurrent_position() + move_point);
    }

    /**
     * Point is increase or decrease
     * @param avatar
     * @param target 
     */
    public void point(Player avatar, int point) {
        avatar.setPoint(avatar.getPoint() + point);
    }
    
    /**
     * Have Winner
     * @param avatar
     * @param target 
     */
    public boolean win(Player avatar, Move move) {
        if(avatar.getCurrent_position() == move.getMax_move()){
            return true;
        }
        else{
            return false;
        }
    }
}
