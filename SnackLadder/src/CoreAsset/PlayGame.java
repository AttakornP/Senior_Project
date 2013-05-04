/*
 * Class Play Game
 * @Author  52363165 Attakorn  Poonkesorn
 * @Since   2013 April 9
 * @Note    JDK 1.7
 * @Note    NetBeans IDE 7.1.2
 * @Note    Windows7 32 bit
 */
package CoreAsset;
 
import snackladder.*;
import java.util.Arrays;
import java.util.Collections;

public class PlayGame {
    public boolean play_game(){
        Player p1 = new Player();
        Player p2 = new Player();
        Dice roll_dice = new Dice();
        Table table = new Table();
        Event event = new Event();
        Move move = new Move(0, 10);
        boolean finish = false;
        
        int[] selected = {  1, 2, 3, 4, 5, 6, 7, 8, 9,10
                          ,11,12,13,14,15,16,17,18,19,20
                          ,21,22,23,24,25,26,27,28,29,30
                         };
        String[] game_table = new String[selected.length];
        
        //1. Create table for play
        
        game_table = table.create_table(selected);
        table.draw_table(game_table);
        //2. Create event on table
        
        //3. setup player for start game
        p1.setName("Med");
        p1.setCurrent_position(0);
        p1.setEnd_status(false);
        p1.setPoint(0);
        p1.setMove(0);
        p1.setPlaying(false);
        
        p2.setName("Yuiiz");
        p2.setCurrent_position(0);
        p2.setEnd_status(false);
        p2.setPoint(0);
        p2.setMove(0);
        p2.setPlaying(false);
        
        //4. randoom order
        Player[] player_list = {p1,p2}; 
        this.start_order(player_list);
        System.out.println("P1 : name "+p1.getName()+", Pos "+p1.getCurrent_position()+", Order"+p1.getOrder());
        System.out.println("P2 : name "+p2.getName()+", Pos "+p2.getCurrent_position()+", Order"+p2.getOrder());
        
        
        //3. play
        while(finish == false){
        
            this.switch_user(2);
        }
        
        return finish;
    }
    
    public int switch_user(int no_player){
        int now_player = 0;
        
        return now_player;
    }
    
    public void start_order(Player[] player){
        Collections.shuffle(Arrays.asList(player));
        for(int i=0 ; i<player.length ; i++){
            player[i].setOrder(i+1);
        }
    }
}
