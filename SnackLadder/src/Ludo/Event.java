/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ludo;

import CoreAsset.Player;
import java.awt.Point;

/**
 *
 * @author Proteus_CartoonMed
 */
public class Event extends CoreAsset.Event {

    public String[] select_table(Player current_player, String[] table1, String[] table2, String[] table3, String[] table4) {
        if (current_player.getOrder() == 1) {
            return table1;
        } else if (current_player.getOrder() == 2) {
            return table2;
        } else if (current_player.getOrder() == 3) {
            return table3;
        } else if (current_player.getOrder() == 4) {
            return table4;
        }
        return null;
    }

    public void check_step(Player current_player, Player[] list_player, String[] table1, String[] table2, String[] table3, String[] table4) {
        Point plyr1 = str_to_point(table1[list_player[0].getCurrent_position()]);
        Point plyr2 = str_to_point(table2[list_player[1].getCurrent_position()]);
        Point plyr3 = str_to_point(table3[list_player[2].getCurrent_position()]);
        Point plyr4 = str_to_point(table4[list_player[3].getCurrent_position()]);
        if (current_player == list_player[0]) {
            if (plyr1.equals(plyr2)) {
                list_player[1].setCurrent_position(0);
            } else if (plyr1.equals(plyr3)) {
                list_player[2].setCurrent_position(0);
            } else if (plyr1.equals(plyr4)) {
                list_player[3].setCurrent_position(0);
            }
        } else if (current_player == list_player[1]) {
            if (plyr2.equals(plyr1)) {
                list_player[0].setCurrent_position(0);
            } else if (plyr2.equals(plyr3)) {
                list_player[2].setCurrent_position(0);
            } else if (plyr2.equals(plyr4)) {
                list_player[3].setCurrent_position(0);
            }
        } else if (current_player == list_player[2]) {
            if (plyr3.equals(plyr1)) {
                list_player[0].setCurrent_position(0);
            } else if (plyr3.equals(plyr2)) {
                list_player[1].setCurrent_position(0);
            } else if (plyr3.equals(plyr4)) {
                list_player[3].setCurrent_position(0);
            }
        } else if (current_player == list_player[3]) {
            if (plyr4.equals(plyr1)) {
                list_player[0].setCurrent_position(0);
            } else if (plyr4.equals(plyr2)) {
                list_player[1].setCurrent_position(0);
            } else if (plyr4.equals(plyr3)) {
                list_player[2].setCurrent_position(0);
            }
        }
    }

    public Point str_to_point(String str_pos) {
        Point pos = new Point();
        pos.x = Integer.parseInt(str_pos.split(",")[0]);
        pos.y = Integer.parseInt(str_pos.split(",")[1]);
        return pos;
    }
}
