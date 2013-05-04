/*
 * Class Helper
 * @Author  52363165 Attakorn  Poonkesorn
 * @Since   2013 May 4
 * @Note    JDK 1.7
 * @Note    NetBeans IDE 7.1.2
 * @Note    Windows7 64 bit
 */
package HardChoice;

//import CoreAsset.Player;

import javax.swing.ImageIcon;


public class Event extends CoreAsset.Event{

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
