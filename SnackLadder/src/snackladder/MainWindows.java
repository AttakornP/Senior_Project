/*
 * Class Main Windows
 * @Author  52363165 Attakorn  Poonkesorn
 * @Since   2013 April 21
 * @Note    JDK 1.7
 * @Note    NetBeans IDE 7.1.2
 * @Note    Windows7 32 bit
 */
package snackladder;

import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class MainWindows extends javax.swing.JFrame {

    Move move = new Move(0, 48);
    Player P1 = new Player();
    Player P2 = new Player();
    Player P3 = new Player();
    Player P4 = new Player();
    Dice dice = new Dice();
    Table table = new Table();
    Event event = new Event();
    int move_point = 0;
    int round;
    Player cur_player;
    String[] table_snake = new String[49];
    int[] event_snake = new int[49];
    

    public MainWindows() {
        initComponents();
        set_start_game();
    }

    public void set_start_game() {
        // Set Player1
        P1.setCurrent_position(0);
        P1.setMove(0);
        P1.setAvatar(label_P1);
        P1.setEnd_status(false);
        P1.setName("Med");
        P1.setPoint(0);
        P1.setPlaying(true);
        P1.setOrder(1);
        // Set Player2
        P2.setCurrent_position(0);
        P2.setMove(6);
        P2.setAvatar(label_P2);
        P2.setEnd_status(false);
        P2.setName("Yuiiz");
        P2.setPoint(0);
        P2.setPlaying(true);
        P2.setOrder(2);
        // Set Player2
        P3.setCurrent_position(0);
        P3.setMove(6);
        P3.setAvatar(label_P3);
        P3.setEnd_status(false);
        P3.setName("Meddy");
        P3.setPoint(0);
        P3.setPlaying(true);
        P3.setOrder(3);
        // Set Player2
        P4.setCurrent_position(0);
        P4.setMove(6);
        P4.setAvatar(label_P4);
        P4.setEnd_status(false);
        P4.setName("Yuyi");
        P4.setPoint(0);
        P4.setPlaying(true);
        P4.setOrder(4);
        
        // create table
        int[] selected = {106,107,95,94,93,92,91,90,89,88,87,86,85,73,61,62,63,64,65,66,67,68,69,70,71,59,47,46,45,44,43,42,41,40,39,38,37,25,13,14,15,16,17,18,19,20,21,22,23};
        this.table_snake = table.create_table(selected);
        
        // create event
        String[] all_event = {"11,36","23,5","24,46","29,10","32,8","40,17"};
        int[] list_event = new int[selected.length];
        for(int i = 0 ; i < selected.length ; i++){
            list_event[i] = 0;
        }
        this.event_snake = event.crate_event(all_event, list_event);
        
        // set start value
        this.label_win.setVisible(false);
        this.label_next_pos.setVisible(false);
        this.round = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_bg = new javax.swing.JPanel();
        layer_bg = new javax.swing.JLayeredPane();
        label_win = new javax.swing.JLabel();
        panel_table = new javax.swing.JPanel();
        layer_table = new javax.swing.JLayeredPane();
        layer_play = new javax.swing.JLayeredPane();
        label_P1 = new javax.swing.JLabel();
        label_P2 = new javax.swing.JLabel();
        label_P3 = new javax.swing.JLabel();
        label_P4 = new javax.swing.JLabel();
        label_next_pos = new javax.swing.JLabel();
        label_table = new javax.swing.JLabel();
        panel_control = new javax.swing.JPanel();
        layer_control = new javax.swing.JLayeredPane();
        label_st_P1 = new javax.swing.JLabel();
        label_st_P2 = new javax.swing.JLabel();
        label_st_P3 = new javax.swing.JLabel();
        label_st_P4 = new javax.swing.JLabel();
        bt_new_game = new javax.swing.JButton();
        bt_roll_dice = new javax.swing.JButton();
        bt_end_turn = new javax.swing.JButton();
        bt_menu = new javax.swing.JButton();
        bt_exit = new javax.swing.JButton();
        label_control = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Snake and Ladder Game");
        setName("MainFrame"); // NOI18N
        setResizable(false);

        panel_bg.setBackground(new java.awt.Color(255, 255, 255));

        label_win.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/winner_P1.jpg"))); // NOI18N
        label_win.setBounds(140, 10, 650, 650);
        layer_bg.add(label_win, javax.swing.JLayeredPane.DEFAULT_LAYER);

        layer_play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                layer_playMouseClicked(evt);
            }
        });

        label_P1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/P1.png"))); // NOI18N
        label_P1.setBounds(780, 590, 36, 35);
        layer_play.add(label_P1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_P2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/P2.png"))); // NOI18N
        label_P2.setBounds(780, 630, 36, 35);
        layer_play.add(label_P2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_P3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/P3.png"))); // NOI18N
        label_P3.setBounds(740, 590, 36, 35);
        layer_play.add(label_P3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_P4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/P4.png"))); // NOI18N
        label_P4.setBounds(740, 630, 36, 35);
        layer_play.add(label_P4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_next_pos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/target.png"))); // NOI18N
        label_next_pos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_next_posMouseClicked(evt);
            }
        });
        label_next_pos.setBounds(780, 590, 44, 44);
        layer_play.add(label_next_pos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        layer_play.setBounds(0, 0, 888, 666);
        layer_table.add(layer_play, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/table1.png"))); // NOI18N
        label_table.setBounds(0, 0, 888, 666);
        layer_table.add(label_table, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panel_tableLayout = new javax.swing.GroupLayout(panel_table);
        panel_table.setLayout(panel_tableLayout);
        panel_tableLayout.setHorizontalGroup(
            panel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tableLayout.createSequentialGroup()
                .addComponent(layer_table, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_tableLayout.setVerticalGroup(
            panel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tableLayout.createSequentialGroup()
                .addComponent(layer_table, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_table.setBounds(0, 0, 890, 666);
        layer_bg.add(panel_table, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_st_P1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Status_not_P1.png"))); // NOI18N
        label_st_P1.setBounds(50, 40, 100, 50);
        layer_control.add(label_st_P1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_st_P2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Status_not_P2.png"))); // NOI18N
        label_st_P2.setBounds(50, 110, 100, 50);
        layer_control.add(label_st_P2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_st_P3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Status_not_P3.png"))); // NOI18N
        label_st_P3.setBounds(50, 190, 100, 50);
        layer_control.add(label_st_P3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_st_P4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Status_not_P4.png"))); // NOI18N
        label_st_P4.setBounds(50, 260, 100, 50);
        layer_control.add(label_st_P4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bt_new_game.setText("New Game");
        bt_new_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_new_gameActionPerformed(evt);
            }
        });
        bt_new_game.setBounds(160, 500, 100, 50);
        layer_control.add(bt_new_game, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bt_roll_dice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dice.png"))); // NOI18N
        bt_roll_dice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_roll_diceActionPerformed(evt);
            }
        });
        bt_roll_dice.setBounds(50, 450, 100, 100);
        layer_control.add(bt_roll_dice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bt_end_turn.setText("End Turn");
        bt_end_turn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_end_turnActionPerformed(evt);
            }
        });
        bt_end_turn.setBounds(50, 450, 100, 100);
        layer_control.add(bt_end_turn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bt_menu.setText("Menu");
        bt_menu.setBounds(50, 590, 100, 50);
        layer_control.add(bt_menu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bt_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        bt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });
        bt_exit.setBounds(160, 590, 100, 50);
        layer_control.add(bt_exit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_control.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/control.png"))); // NOI18N
        label_control.setBounds(0, 0, 300, 666);
        layer_control.add(label_control, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panel_controlLayout = new javax.swing.GroupLayout(panel_control);
        panel_control.setLayout(panel_controlLayout);
        panel_controlLayout.setHorizontalGroup(
            panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_controlLayout.createSequentialGroup()
                .addComponent(layer_control, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_controlLayout.setVerticalGroup(
            panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_controlLayout.createSequentialGroup()
                .addComponent(layer_control, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_control.setBounds(900, 0, 300, 666);
        layer_bg.add(panel_control, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panel_bgLayout = new javax.swing.GroupLayout(panel_bg);
        panel_bg.setLayout(panel_bgLayout);
        panel_bgLayout.setHorizontalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layer_bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        panel_bgLayout.setVerticalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layer_bg, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void layer_playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_layer_playMouseClicked
       
    }//GEN-LAST:event_layer_playMouseClicked

    private void label_next_posMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_next_posMouseClicked
        // check can move ?
        if(move.can_move(this.cur_player)){
            // move avatar to target
            this.cur_player.getAvatar().setLocation(this.label_next_pos.getX()+5,this.label_next_pos.getY()+5);
        }
        
        // set new current position
        int old_pos = this.cur_player.getCurrent_position();
        this.cur_player.setCurrent_position(move.move_forward(old_pos, this.cur_player.getMove()));
        
        //check event on new current position
        int new_pos = this.cur_player.getCurrent_position();
        if(this.event_snake[new_pos] != 0){
            this.cur_player.setCurrent_position(this.event_snake[new_pos]);
            Point p_new_pos = move.str_to_point(this.table_snake[this.event_snake[new_pos]]);
            this.cur_player.getAvatar().setLocation(p_new_pos.x-20,p_new_pos.y-20);
        }
        
        //set move point = 0 after play in turn
        this.cur_player.setMove(0);
        
        //check win
        if(event.win(this.cur_player, move)){
            label_win.setIcon(new ImageIcon(getClass().getResource("/img/winner_P"+this.cur_player.getOrder()+".jpg")));
            label_win.setVisible(true);
        }
        
    }//GEN-LAST:event_label_next_posMouseClicked

    private void bt_roll_diceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_roll_diceActionPerformed
        this.label_next_pos.setVisible(true);
        //check who is playing
        if(this.round %4 == 0){
            this.cur_player = P1;
            label_st_P1.setIcon(new ImageIcon(getClass().getResource("/img/Status_P1.png")));
            label_st_P2.setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P2.png")));
            label_st_P3.setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P3.png")));
            label_st_P4.setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P4.png")));
        }
        else if(this.round %4 == 1) {
            this.cur_player = P2;
            label_st_P1.setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P1.png")));
            label_st_P2.setIcon(new ImageIcon(getClass().getResource("/img/Status_P2.png")));
            label_st_P3.setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P3.png")));
            label_st_P4.setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P4.png")));
        }
        else if(this.round %4 == 2){
            this.cur_player = P3;
            label_st_P1.setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P1.png")));
            label_st_P2.setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P2.png")));
            label_st_P3.setIcon(new ImageIcon(getClass().getResource("/img/Status_P3.png")));
            label_st_P4.setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P4.png")));
        }
        else {
            this.cur_player = P4;
            label_st_P1.setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P1.png")));
            label_st_P2.setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P2.png")));
            label_st_P3.setIcon(new ImageIcon(getClass().getResource("/img/Status_not_P3.png")));
            label_st_P4.setIcon(new ImageIcon(getClass().getResource("/img/Status_P4.png")));
        }
        
        System.out.println("P"+(this.round % 2+1)+" Turn");
        
        //random number
        this.move_point = dice.random_dice();
        dice.set_point_pic(this.bt_roll_dice, this.move_point);
        
        //set move point to player
        this.cur_player.setMove(this.move_point);
        System.out.println("Move Point : "+this.cur_player.getMove());
        
        //show icon target
        int next_pos = move.move_forward(this.cur_player.getCurrent_position(), this.cur_player.getMove());
        move.position_move(this.layer_play, this.label_next_pos, this.table_snake, next_pos);
       
        //set unenable
        this.bt_roll_dice.setVisible(false);
    }//GEN-LAST:event_bt_roll_diceActionPerformed

    private void bt_end_turnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_end_turnActionPerformed
        // end turn
        if(this.cur_player.getMove() == 0){
            this.round++;
        }
        dice.set_point_pic(this.bt_roll_dice, 0);
        bt_roll_dice.setVisible(true);
        
    }//GEN-LAST:event_bt_end_turnActionPerformed

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_exitActionPerformed

    private void bt_new_gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_new_gameActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new MainWindows().setVisible(true);
    }//GEN-LAST:event_bt_new_gameActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindows().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_end_turn;
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_menu;
    private javax.swing.JButton bt_new_game;
    private javax.swing.JButton bt_roll_dice;
    private javax.swing.JLabel label_P1;
    private javax.swing.JLabel label_P2;
    private javax.swing.JLabel label_P3;
    private javax.swing.JLabel label_P4;
    private javax.swing.JLabel label_control;
    private javax.swing.JLabel label_next_pos;
    private javax.swing.JLabel label_st_P1;
    private javax.swing.JLabel label_st_P2;
    private javax.swing.JLabel label_st_P3;
    private javax.swing.JLabel label_st_P4;
    private javax.swing.JLabel label_table;
    private javax.swing.JLabel label_win;
    private javax.swing.JLayeredPane layer_bg;
    private javax.swing.JLayeredPane layer_control;
    private javax.swing.JLayeredPane layer_play;
    private javax.swing.JLayeredPane layer_table;
    private javax.swing.JPanel panel_bg;
    private javax.swing.JPanel panel_control;
    private javax.swing.JPanel panel_table;
    // End of variables declaration//GEN-END:variables
}
