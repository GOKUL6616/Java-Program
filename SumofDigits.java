import java.util.*;
class SumofDigits {
    public static int SumofDigit(int num) {
        int sum = 0;
        while (num > 9) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum+num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = SumofDigit(num);
        System.out.println(res);
    }
}