/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HardChoice;

import javax.swing.JLabel;

/**
 *
 * @author Proteus_CartoonMed
 */
public class Player extends CoreAsset.Player{
    private int bridge_point = 0;
    private JLabel label_bridge_point;

    public int getBridge_point() {
        return bridge_point;
    }

    public JLabel getLabel_bridge_point() {
        return label_bridge_point;
    }

    public void setBridge_point(int bridge_point) {
        this.bridge_point = bridge_point;
    }

    public void setLabel_bridge_point(JLabel label_bridge_point) {
        this.label_bridge_point = label_bridge_point;
    }
    
}
