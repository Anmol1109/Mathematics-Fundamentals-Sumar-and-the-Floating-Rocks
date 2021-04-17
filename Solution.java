import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static int gcd(int a,int b){
        while(a > 0 && b > 0){
            if(a > b)
                a %= b;
            else
                b %= a;
        }
        return a + b;
    }
    static int solve(int x1, int y1, int x2, int y2) {
        return gcd(Math.abs(x1 - x2),Math.abs(y1 - y2));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] x1Y1X2Y2 = scanner.nextLine().split(" ");

            int x1 = Integer.parseInt(x1Y1X2Y2[0]);

            int y1 = Integer.parseInt(x1Y1X2Y2[1]);

            int x2 = Integer.parseInt(x1Y1X2Y2[2]);

            int y2 = Integer.parseInt(x1Y1X2Y2[3]);

            int result = solve(x1, y1, x2, y2) - 1;

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
