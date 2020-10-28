import java.math.*;

public class case1 {

    public static void main(String args[]){
        prog();
    }


    public static void prog(){
        int player_1, player_2;
        int card_drawn, n = 3;
        double p1_wins = 0, p2_wins = 0, prob;
        long i;
        for (long j = 1; j <= 9999999; j++) {
            i = 1;
            card_drawn = (int)(Math.random() * n);
            for (; i <= 9999; i++) {
                player_1 = (int) (Math.random() * n);
                if (player_1 == card_drawn) {
                    p1_wins++;
                    break;
                }
                player_2 = (int) (Math.random() * n);
                if (player_2 == card_drawn) {
                    p2_wins++;
                    break;
                }
            }
        }
        prob = (p1_wins / (p1_wins + p2_wins)) * 100;
        System.out.println("Winner % = " + prob + " %");
        System.out.println("Total games = " + (p1_wins + p2_wins));
    }
}
