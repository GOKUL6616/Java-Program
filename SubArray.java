import java.util.*;
public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[num];
        for (int a = 0; a < num; a++) {
            arr[a] = sc.nextInt();
        }
        int count = 0;
        for (int l = 0; l < num; l++) {
            if (arr[l] < k) {
                count++;
            }
        }
        for (int i = 0; i < num - 1; i++) {
            if (arr[i] * arr[i + 1] < k) {
                count++;
            }
        }
        for (int m = 0; m < num - 2; m++) {
                    if (arr[m] * arr[m+1] * arr[m+2] < k) {
                        count++;
                    }
                }
        System.out.println(count);
            }
        }


