import java.util.Scanner;

/**
 * Created by suavelizard on 6/15/14.
 */
public class UtopianTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCases = scan.nextInt();
        int results[] = new int[numCases];
        for (int i = 0; i < numCases; i++) {
            int cycles = scan.nextInt();
            results[i] = getGrowth(cycles);
        }
        for (int i = 0; i < numCases; i++) {
            System.out.println(results[i]);
        }
        scan.close();
    }

    static int getGrowth(int n) {
        int height = 1;
        if (n <= 0) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                height = height * 2;
            } else {
                height++;
            }
        }
        return height;
    }
}
