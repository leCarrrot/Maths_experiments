public class case2 {

    public static void main(String args[]){
        prog();
    }


    public static void prog(){
        int player_1, player_2;
        int card_drawn, n = 6;
        int deck[] = new int[n + 1];
        boolean check;
        double p1_wins = 0, p2_wins = 0, prob;
        long i; int no;
        for (long j = 1; j <= 1; j++) {
            no = 0;
            check = false;
            i = n;
            card_drawn = (int)(Math.random() * n);
            for (; i >= 1;) {
                do {
                    player_1 = (int) (Math.random() * n);
                    for (int m = 0; m < n; m++) {
                        if (player_1 == deck[m]){
                            check = true;
                        }else{
                            check = false;
                        }
                    }
                }while (check);
                i--;
                deck [no] = player_1;
                no++;
                if (player_1 == card_drawn) {
                    p1_wins++;
                    break;
                }
                check = false;
                do {
                    player_2 = (int) (Math.random() * n);
                    for (int m = 0; m < n; m++) {
                        if (player_2 == deck[m]){
                            check = true;
                        }else{
                            check = false;
                        }
                    }
                }while (check);
                i--;
                deck [no] = player_2;
                no++;
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
