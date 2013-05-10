/*
 * Class Player
 * @Author  52363165 Attakorn  Poonkesorn
 * @Since   2013 April 5
 * @Note    JDK 1.7
 * @Note    NetBeans IDE 7.1.2
 * @Note    Windows7 32 bit
 */
package CoreAsset;

import javax.swing.Icon;
import javax.swing.JLabel;

public class Player {
    
    private int current_position;
    private String name;
    private int move;
    private JLabel avatar;
    private int point;
    private JLabel label_point;
    private boolean playing;

    public void setLabel_playing(JLabel label_playing) {
        this.label_playing = label_playing;
    }
    private JLabel label_playing;

    public JLabel getLabel_playing() {
        return label_playing;
    }

    public void setLabel_point(JLabel label_point) {
        this.label_point = label_point;
    }
    private boolean end_status;

    public boolean isPlaying() {
        return playing;
    }

    public JLabel getLabel_point() {
        return label_point;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
    private int order;

    public JLabel getAvatar() {
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

    public void setAvatar(JLabel avatar) {
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
