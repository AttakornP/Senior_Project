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
    
    
    /**
     * what_event
     * @param avatar
     * @param cur_event 
     */
    public void what_event(Player avatar, String cur_event){ 
        String type = cur_event.split(",")[1];
        int point = Integer.parseInt(cur_event.split(",")[2]);
        if(type.equals("J")){
            this.jump(avatar, point);
        }
        else if(type.equals("M")){
            this.move(avatar, point);
        }
        else if(type.equals("P")){
            this.point(avatar, point);
        }
    }
    
    public int[] crate_event(String[] all_event, int[] list_event){
        for(int i = 0 ; i < all_event.length ; i++){
            int target = Integer.parseInt(all_event[i].split(",")[0]);
            list_event[target] = Integer.parseInt(all_event[i].split(",")[1]);
        }
        return list_event;
    }
    
}
