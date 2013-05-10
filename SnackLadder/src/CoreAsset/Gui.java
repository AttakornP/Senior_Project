/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreAsset;

import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/**
 *
 * @author Proteus_CartoonMed
 */
public class Gui {

    public Player selected_player(Player[] list_plyr, int no_player, int round) {
        Player cur_player = new Player();
        if (round % no_player == 0) {
            cur_player = list_plyr[0];
            list_plyr[0].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_P1.png")));
            list_plyr[1].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P2.png")));
            list_plyr[2].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P3.png")));
            list_plyr[3].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P4.png")));
        } else if (round % no_player == 1) {
            cur_player = list_plyr[1];
            list_plyr[0].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P1.png")));
            list_plyr[1].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_P2.png")));
            list_plyr[2].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P3.png")));
            list_plyr[3].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P4.png")));
        } else if (round % no_player == 2) {
            cur_player = list_plyr[2];
            list_plyr[0].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P1.png")));
            list_plyr[1].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P2.png")));
            list_plyr[2].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_P3.png")));
            list_plyr[3].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P4.png")));
        } else if (round % no_player == 3) {
            cur_player = list_plyr[3];
            list_plyr[0].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P1.png")));
            list_plyr[1].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P2.png")));
            list_plyr[2].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P3.png")));
            list_plyr[3].getLabel_playing().setIcon(new ImageIcon(getClass().getResource("/img/Status_P4.png")));
        }
        return cur_player;
    }

    public void set_start_location(Player[] list_plyr, Point st_point) {
        for (int i = 0; i < list_plyr.length; i++) {
            //set start position avatar
            list_plyr[i].getAvatar().setLocation(st_point.x - 17, st_point.y - 17);
        }
    }

    public void set_start_point(Player[] list_plyr) {
        for (int i = 0; i < list_plyr.length; i++) {
            //set start player point
            list_plyr[i].getLabel_point().setText(Integer.toString(list_plyr[i].getPoint()));
        }
    }

    /*
     * set current posion
     * set move point
     * set avatar
     * set end status
     * set name
     * set point
     * set order
     * set label play
     * set playing
     */
    public void set_init_value_player(Player[] list_plyr, JLabel[] list_label, JLabel[] label_play) {
        for (int i = 0; i < list_plyr.length; i++) {
            list_plyr[i].setCurrent_position(0);
            list_plyr[i].setMove(0);
            list_plyr[i].setAvatar(list_label[i]);
            list_plyr[i].setEnd_status(false);
            list_plyr[i].setName("Player" + (i + 1));
            list_plyr[i].setPoint(0);
            list_plyr[i].setOrder(i + 1);
            list_plyr[i].setLabel_playing(label_play[i]);
            list_plyr[i].setPlaying(false);
        }
    }
}
