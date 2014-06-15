import java.util.Scanner;

/**
 * Created by suavelizard on 6/15/14.
 */
public class ServiceLane {
    public void main(String[] args){
        Scanner in = new Scanner(System.in);
        int freewayLength = in.nextInt();
        int numTestCases = in.nextInt();
        int[] arrayWidths = new int[freewayLength];
        for (int i = 0; i < freewayLength; i++){
            arrayWidths[i] = in.nextInt();
        }
        for (int j = 0; j < numTestCases; j++){
            int entryPoint = in.nextInt();
            int exitPoint = in.nextInt();
        }
    }
}
