/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snackladder;

import javax.swing.Icon;

/**
 *
 * @author cartoonmed
 */
public class Player {
    
    private int current_position;
    private int point;
    private String name;
    private int move;
    private Icon avatar;
    private boolean end_status;

    public Icon getAvatar() {
        return avatar;
    }

    public int getCurrent_position() {
        return current_position;
    }

    public boolean isEnd_status() {
        return end_status;
    }

    public int getMove() {
        return move;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    public void setAvatar(Icon avatar) {
        this.avatar = avatar;
    }

    public void setCurrent_position(int current_position) {
        this.current_position = current_position;
    }

    public void setEnd_status(boolean end_status) {
        this.end_status = end_status;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    
    
    
}
