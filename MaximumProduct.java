import java.util.*;
public class MaximumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int a = 0; a < num; a++) {
            arr[a] = sc.nextInt();
        }
        int fmax=0;
        int smax=0;
        for (int i = 0; i < num-1; i++) {
            for(int j=i+1;j<num;j++){
                    int prod=arr[i]*arr[j];
                    if(prod>fmax){
                        fmax=prod;
                    }
                }
            }
        for (int i = 0; i < num-2; i++) {
            for(int j=i+1;j<num-1;j++){
                for(int k=j+1;k<num;k++) {
                    int prod = arr[i] * arr[j]*arr[k];
                    if (prod > smax) {
                        smax = prod;
                    }
                }
            }
        }
        if(fmax>smax){
            System.out.println(fmax);
        }
        else{
            System.out.println(smax);
        }
        }

    }


