/*
 * Class Main Windows
 * @Author  52363165 Attakorn  Poonkesorn
 * @Since   2013 April 21
 * @Note    JDK 1.7
 * @Note    NetBeans IDE 7.1.2
 * @Note    Windows7 32 bit
 */
package Ludo;

import HardChoice.*;
import snackladder.*;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import CoreAsset.Dice;
import CoreAsset.Player;
//import CoreAsset.Event;
import CoreAsset.Move;
import CoreAsset.Table;
import CoreAsset.Gui;

public class MainWindows extends javax.swing.JFrame {

    int number = 36;
    Move move = new Move(0, this.number - 1);
    Player P1 = new Player();
    Player P2 = new Player();
    Player P3 = new Player();
    Player P4 = new Player();
    Dice dice = new Dice();
    Gui gui = new Gui();
    Table table = new Table();
    Event event = new Event();
    int move_point = 0;
    int round;
    Player cur_player;
    String[] table_ludo1 = new String[this.number];
    String[] table_ludo2 = new String[this.number];
    String[] table_ludo3 = new String[this.number];
    String[] table_ludo4 = new String[this.number];
    String[] current_table = new String[this.number];
    int[] event_hc = new int[this.number];
    Player[] list_plyr = {P1, P2, P3, P4};
    int opposite_bridge = 0;
    int plyr_no = 4;

    public MainWindows() {
        initComponents();
        set_start_game();
    }

    public void set_start_game() {

        JLabel[] list_label = {label_P1, label_P2, label_P3, label_P4};
        JLabel[] label_play = {label_st_P1, label_st_P2, label_st_P3, label_st_P4};
        gui.set_init_value_player(this.list_plyr, list_label, label_play);
        // Set Player1
        P1.setLabel_point(label_point_p1);
        // Set Player2
        P2.setLabel_point(label_point_p2);
        // Set Player3
        P3.setLabel_point(label_point_p3);
        // Set Player4
        P4.setLabel_point(label_point_p4);


        // create table
        int[] selected1 = {33, 7, 19, 31, 43, 44, 45, 46, 58, 70, 69, 68, 67, 79, 91, 103, 102, 101, 89, 77, 65, 64, 63, 62, 50, 38, 39, 40, 41, 29, 17, 5, 6, 18, 30, 42};
        int[] selected2 = {81, 70, 69, 68, 67, 79, 91, 103, 102, 101, 89, 77, 65, 64, 63, 62, 50, 38, 39, 40, 41, 29, 17, 5, 6, 7, 19, 31, 43, 44, 45, 46, 58, 57, 56, 55};
        int[] selected3 = {27, 38, 39, 40, 41, 29, 17, 5, 6, 7, 19, 31, 43, 44, 45, 46, 58, 70, 69, 68, 67, 79, 91, 103, 102, 101, 89, 77, 65, 64, 63, 62, 50, 51, 52, 53};
        int[] selected4 = {75, 101, 89, 77, 65, 64, 63, 62, 50, 38, 39, 40, 41, 29, 17, 5, 6, 7, 19, 31, 43, 44, 45, 46, 58, 70, 69, 68, 67, 79, 91, 103, 102, 90, 78, 66};

        this.table_ludo1 = table.create_table(selected1);
        this.table_ludo2 = table.create_table(selected2);
        this.table_ludo3 = table.create_table(selected3);
        this.table_ludo4 = table.create_table(selected4);


        // set start value
//        this.label_win.setVisible(false);
        this.bt_end_turn.setEnabled(false);
        panel_table.setVisible(true);
        bt_roll_dice.setEnabled(true);
        this.round = 0;
        Point st_point1 = move.str_to_point(this.table_ludo1[0]);
        Point st_point2 = move.str_to_point(this.table_ludo2[0]);
        Point st_point3 = move.str_to_point(this.table_ludo3[0]);
        Point st_point4 = move.str_to_point(this.table_ludo4[0]);

        // set icon target to hide
        this.label_move_next.setVisible(false);

        //set start position avatar
        P1.getAvatar().setLocation(st_point1.x - 17, st_point1.y - 17);
        P2.getAvatar().setLocation(st_point2.x - 17, st_point2.y - 17);
        P3.getAvatar().setLocation(st_point3.x - 17, st_point3.y - 17);
        P4.getAvatar().setLocation(st_point4.x - 17, st_point4.y - 17);
        //set start player point
        gui.set_start_point(this.list_plyr);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_bg = new javax.swing.JPanel();
        layer_bg = new javax.swing.JLayeredPane();
        panel_table = new javax.swing.JPanel();
        layer_table = new javax.swing.JLayeredPane();
        layer_play = new javax.swing.JLayeredPane();
        label_P1 = new javax.swing.JLabel();
        label_P2 = new javax.swing.JLabel();
        label_P3 = new javax.swing.JLabel();
        label_P4 = new javax.swing.JLabel();
        label_move_next = new javax.swing.JLabel();
        label_table = new javax.swing.JLabel();
        panel_control = new javax.swing.JPanel();
        layer_control = new javax.swing.JLayeredPane();
        label_st_P1 = new javax.swing.JLabel();
        label_st_P2 = new javax.swing.JLabel();
        label_st_P3 = new javax.swing.JLabel();
        label_st_P4 = new javax.swing.JLabel();
        point_p1 = new javax.swing.JLabel();
        bt_new_game = new javax.swing.JButton();
        bt_roll_dice = new javax.swing.JButton();
        bt_end_turn = new javax.swing.JButton();
        bt_exit = new javax.swing.JButton();
        label_control = new javax.swing.JLabel();
        point_p2 = new javax.swing.JLabel();
        point_p3 = new javax.swing.JLabel();
        point_p4 = new javax.swing.JLabel();
        label_point_p1 = new javax.swing.JLabel();
        label_point_p2 = new javax.swing.JLabel();
        label_point_p3 = new javax.swing.JLabel();
        label_point_p4 = new javax.swing.JLabel();
        label_win = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ludo Game");
        setName("MainFrame"); // NOI18N
        setResizable(false);

        panel_bg.setBackground(new java.awt.Color(255, 255, 255));

        panel_table.setBackground(new java.awt.Color(255, 255, 255));

        label_P1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/P1.png"))); // NOI18N
        label_P1.setBounds(160, 620, 36, 35);
        layer_play.add(label_P1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_P2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/P2.png"))); // NOI18N
        label_P2.setBounds(120, 620, 36, 35);
        layer_play.add(label_P2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_P3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/P3.png"))); // NOI18N
        label_P3.setBounds(30, 620, 36, 35);
        layer_play.add(label_P3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_P4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/P4.png"))); // NOI18N
        label_P4.setBounds(80, 620, 36, 35);
        layer_play.add(label_P4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_move_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/target.png"))); // NOI18N
        label_move_next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_move_nextMouseClicked(evt);
            }
        });
        label_move_next.setBounds(710, 590, 44, 44);
        layer_play.add(label_move_next, javax.swing.JLayeredPane.DEFAULT_LAYER);

        layer_play.setBounds(0, 0, 888, 666);
        layer_table.add(layer_play, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/table_ludo.png"))); // NOI18N
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

        panel_control.setBackground(new java.awt.Color(255, 255, 255));

        label_st_P1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Status_not_P1.png"))); // NOI18N
        label_st_P1.setBounds(50, 40, 100, 50);
        layer_control.add(label_st_P1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_st_P2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Status_not_P2.png"))); // NOI18N
        label_st_P2.setBounds(50, 110, 100, 50);
        layer_control.add(label_st_P2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_st_P3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Status_not_P3.png"))); // NOI18N
        label_st_P3.setBounds(50, 180, 100, 50);
        layer_control.add(label_st_P3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_st_P4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Status_not_P4.png"))); // NOI18N
        label_st_P4.setBounds(50, 250, 100, 50);
        layer_control.add(label_st_P4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        point_p1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        point_p1.setText("Point : ");
        point_p1.setBounds(170, 60, 58, 20);
        layer_control.add(point_p1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bt_new_game.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/newgame.png"))); // NOI18N
        bt_new_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_new_gameActionPerformed(evt);
            }
        });
        bt_new_game.setBounds(50, 590, 100, 50);
        layer_control.add(bt_new_game, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bt_roll_dice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dice.png"))); // NOI18N
        bt_roll_dice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_roll_diceActionPerformed(evt);
            }
        });
        bt_roll_dice.setBounds(160, 470, 100, 100);
        layer_control.add(bt_roll_dice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bt_end_turn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/endtern.png"))); // NOI18N
        bt_end_turn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_end_turnActionPerformed(evt);
            }
        });
        bt_end_turn.setBounds(50, 470, 100, 100);
        layer_control.add(bt_end_turn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bt_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        bt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });
        bt_exit.setBounds(160, 590, 100, 50);
        layer_control.add(bt_exit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_control.setBackground(new java.awt.Color(255, 255, 255));
        label_control.setBounds(0, 0, 0, 0);
        layer_control.add(label_control, javax.swing.JLayeredPane.DEFAULT_LAYER);

        point_p2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        point_p2.setText("Point : ");
        point_p2.setBounds(170, 130, 58, 20);
        layer_control.add(point_p2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        point_p3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        point_p3.setText("Point : ");
        point_p3.setBounds(170, 200, 58, 20);
        layer_control.add(point_p3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        point_p4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        point_p4.setText("Point : ");
        point_p4.setBounds(170, 270, 58, 20);
        layer_control.add(point_p4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_point_p1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_point_p1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_point_p1.setBounds(230, 60, 50, 20);
        layer_control.add(label_point_p1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_point_p2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_point_p2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_point_p2.setBounds(230, 130, 50, 20);
        layer_control.add(label_point_p2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_point_p3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_point_p3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_point_p3.setBounds(230, 200, 50, 20);
        layer_control.add(label_point_p3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_point_p4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_point_p4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_point_p4.setBounds(230, 270, 50, 20);
        layer_control.add(label_point_p4, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

        label_win.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/winner_P1.jpg"))); // NOI18N
        label_win.setBounds(140, 10, 650, 650);
        layer_bg.add(label_win, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

    private void label_move_nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_move_nextMouseClicked
        // check can move ?
        if (move.can_move(this.cur_player)) {
            // move avatar to target
            this.cur_player.getAvatar().setLocation(this.label_move_next.getX() + 5, this.label_move_next.getY() + 5);
        }

        // set new current position
        int old_pos = this.cur_player.getCurrent_position();
        this.cur_player.setCurrent_position(move.move_forward(old_pos, 1));


        //set move point decrease 1 after play in turn
        this.cur_player.setMove(this.cur_player.getMove() - 1);
        System.out.println("remain point" + this.cur_player.getMove());

        //check win
        if (event.win(this.cur_player, move)) {
            this.cur_player.setMove(0);
            this.cur_player.setPoint(this.cur_player.getPoint() + 1);
            this.cur_player.getLabel_point().setText(Integer.toString(this.cur_player.getPoint()));
            this.cur_player.setCurrent_position(0);

            if (this.cur_player.getPoint() == 4) {
                label_win.setIcon(new ImageIcon(getClass().getResource("/img/winner_P" + this.cur_player.getOrder() + ".jpg")));
                panel_table.setVisible(false);
            }
        }

        // check end turn or move again
        if (this.cur_player.getMove() == 0) {
            this.bt_end_turn.setEnabled(true);
            event.check_step(this.cur_player, this.list_plyr, this.table_ludo1, this.table_ludo2, this.table_ludo3, this.table_ludo4);

            Point curr_point1 = move.str_to_point(this.table_ludo1[P1.getCurrent_position()]);
            P1.getAvatar().setLocation(curr_point1.x - 17, curr_point1.y - 17);

            Point curr_point2 = move.str_to_point(this.table_ludo2[P2.getCurrent_position()]);
            P2.getAvatar().setLocation(curr_point2.x - 17, curr_point2.y - 17);

            Point curr_point3 = move.str_to_point(this.table_ludo3[P3.getCurrent_position()]);
            P3.getAvatar().setLocation(curr_point3.x - 17, curr_point3.y - 17);

            Point curr_point4 = move.str_to_point(this.table_ludo4[P4.getCurrent_position()]);
            P4.getAvatar().setLocation(curr_point4.x - 17, curr_point4.y - 17);

            this.label_move_next.setVisible(false);
        } else {
            int next_pos = move.move_forward(this.cur_player.getCurrent_position(), 1);
            move.position_move(this.layer_play, this.label_move_next, this.current_table, next_pos);
        }
    }//GEN-LAST:event_label_move_nextMouseClicked

    private void bt_roll_diceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_roll_diceActionPerformed
        //check who is playing

        this.cur_player = (Player) gui.selected_player(this.list_plyr, this.plyr_no, this.round);
        this.current_table = event.select_table(this.cur_player, this.table_ludo1, this.table_ludo2, this.table_ludo3, this.table_ludo4);

        //random number
        this.move_point = dice.random_dice();
        dice.set_point_pic(this.bt_roll_dice, this.move_point);


        if (this.cur_player.getCurrent_position() == 0) {
            if (this.move_point != 6) {
                this.move_point = 0;
                this.cur_player.setMove(this.move_point);
                this.bt_end_turn.setEnabled(true);
            } else {
                this.move_point = 1;
            }
        }

        if (this.move_point != 0) {

            //set move point to player
            this.cur_player.setMove(this.move_point);
            System.out.println("Move Point : " + this.cur_player.getMove());

            //show icon target
            this.label_move_next.setVisible(true);
            int next_pos = move.move_forward(this.cur_player.getCurrent_position(), 1);
            move.position_move(this.layer_play, this.label_move_next, this.current_table, next_pos);

            //set unenable
            this.bt_end_turn.setEnabled(false);
        }

        this.bt_roll_dice.setEnabled(false);
    }//GEN-LAST:event_bt_roll_diceActionPerformed

    private void bt_end_turnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_end_turnActionPerformed
        // end turn
        if (this.cur_player.getMove() == 0) {
            this.round++;
        }

        dice.set_point_pic(this.bt_roll_dice, 0);
        this.bt_roll_dice.setEnabled(true);
        this.bt_end_turn.setEnabled(false);

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
    private javax.swing.JButton bt_new_game;
    private javax.swing.JButton bt_roll_dice;
    private javax.swing.JLabel label_P1;
    private javax.swing.JLabel label_P2;
    private javax.swing.JLabel label_P3;
    private javax.swing.JLabel label_P4;
    private javax.swing.JLabel label_control;
    private javax.swing.JLabel label_move_next;
    private javax.swing.JLabel label_point_p1;
    private javax.swing.JLabel label_point_p2;
    private javax.swing.JLabel label_point_p3;
    private javax.swing.JLabel label_point_p4;
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
    private javax.swing.JLabel point_p1;
    private javax.swing.JLabel point_p2;
    private javax.swing.JLabel point_p3;
    private javax.swing.JLabel point_p4;
    // End of variables declaration//GEN-END:variables
}
