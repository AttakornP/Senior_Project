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
import snackladder.*;

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
    
    
    public Player selected_player(Player[] list_plyr, int no_player, int round){
        Player cur_player = new HardChoice.Player();
        if(round % no_player == 0){
            cur_player = list_plyr[0];
            list_plyr[0].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_P1.png")));
            list_plyr[1].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P2.png")));
            list_plyr[2].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P3.png")));
            list_plyr[3].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P4.png")));
        }
        else if(round % no_player == 1) {
            cur_player = list_plyr[1];
            list_plyr[0].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P1.png")));
            list_plyr[1].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_P2.png")));
            list_plyr[2].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P3.png")));
            list_plyr[3].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P4.png")));
        }
        else if(round % no_player == 2){
            cur_player = list_plyr[2];
            list_plyr[0].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P1.png")));
            list_plyr[1].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P2.png")));
            list_plyr[2].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_P3.png")));
            list_plyr[3].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P4.png")));
        }
        else {
            cur_player = list_plyr[3];
            list_plyr[0].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P1.png")));
            list_plyr[1].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P2.png")));
            list_plyr[2].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P3.png")));
            list_plyr[3].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_P4.png")));
        }
        return cur_player;
    }
    
}
