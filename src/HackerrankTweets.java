import java.util.Scanner;

/**
 * Created by Suavelizard on 21/06/14 for HackerRank2014.
 */
public class HackerrankTweets {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int numTweets = scan.nextInt();
        int numMatches = 0;
        for(int i = 0; i <= numTweets; i++){
            if(scan.nextLine().toLowerCase().contains("hackerrank")){
                numMatches++;
            }
        }
        scan.close();
        System.out.println(numMatches);
    }
}
