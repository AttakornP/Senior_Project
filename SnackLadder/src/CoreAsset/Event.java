/*
 * Class Event
 * @Author  52363165 Attakorn  Poonkesorn
 * @Since   2013 April 5
 * @Note    JDK 1.7
 * @Note    NetBeans IDE 7.1.2
 * @Note    Windows7 32 bit
 */
package CoreAsset;

import javax.swing.ImageIcon;


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
    
    
    public int[] crate_event(String[] all_event, int[] list_event){
        for(int i = 0 ; i < all_event.length ; i++){
            int target = Integer.parseInt(all_event[i].split(",")[0]);
            list_event[target] = Integer.parseInt(all_event[i].split(",")[1]);
        }
        return list_event;
    }
    
        
        public Player highest_point(Player[] list_plyr) {
        Player max_point_player = new Player();
        max_point_player = list_plyr[0];
        for (int i = 1; i < list_plyr.length; i++) {
            System.out.println("P"+list_plyr[i - 1].getOrder()+" Point : "+list_plyr[i - 1].getPoint());
            System.out.println("P"+list_plyr[i].getOrder()+" Point : "+list_plyr[i].getPoint());
            if (max_point_player.getPoint() == list_plyr[i].getPoint()) {
                if (max_point_player.getCurrent_position() < list_plyr[i].getCurrent_position()) {
                    max_point_player = list_plyr[i];
                } 
            } else if (max_point_player.getPoint() < list_plyr[i].getPoint()) {
                max_point_player = list_plyr[i];
            } 
            System.out.println("P"+max_point_player.getOrder());
        }
        System.out.println("P"+max_point_player.getOrder());
        return max_point_player;
    }
    
}
