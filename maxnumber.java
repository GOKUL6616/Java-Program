
import java.util.*;

public class maxnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading input
        int n = sc.nextInt();
        int[] arr = new int[n];
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += Math.abs(arr[i]);
        }

        // Maximum difference is total sum of absolute values
        System.out.println("Maximum Difference = " + totalSum);
    }
}

