/*
 * Class Player
 * @Author  52363165 Attakorn  Poonkesorn
 * @Since   2013 April 5
 * @Note    JDK 1.7
 * @Note    NetBeans IDE 7.1.2
 * @Note    Windows7 32 bit
 */
package snackladder;

import javax.swing.Icon;

public class Player {
    
    private int current_position;
    private int point;
    private String name;
    private int move;
    private Icon avatar;
    private boolean end_status;

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }
    private boolean playing;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
    private int order;

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
