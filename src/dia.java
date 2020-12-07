import java.util.*;
public class dia{
    public static void main(String args[]){
        System.out.println("Enter the wrd../n");
        String wrd = new Scanner(System.in).nextLine();
            printUH(wrd);
            System.out.println(wrd);
            printLH(wrd);
    }

    public static void printUH(String input) {
        int middle = input.length() / 2;
        int left, right;
        left = right = middle;

        for(int row = 1; row <= middle; row++) {
            for (int i = 1; i <= (middle - row + 1); i++) {
                System.out.print(" ");
            }
            System.out.println(input.substring(left, right + 1));
            left--;
            right++;
        }
    }

    public static void printLH(String input) {
        int middle = input.length() / 2;
        int left, right;
        left = 1;
        right = input.length() - 1;

        for(int row = 1; row <= middle; row++) {
            for (int i = 1; i <= row; i++) {
                System.out.print(" ");
            }
            System.out.println(input.substring(left, right));
            left++;
            right--;
        }
    }
}