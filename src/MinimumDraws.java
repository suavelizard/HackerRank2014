import java.util.Scanner;

/**
 * Created by Zane on 21/06/14.
 */
public class MinimumDraws {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int numTestCases = scan.nextInt();
        int numSocks = scan.nextInt();
        for(int i = 0; i <= numTestCases; i++){
            System.out.println(numSocks-1);

        }
        scan.close();
    }
}
