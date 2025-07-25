import java.util.*;
public class StockBuyAndSell {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int a=0;a<num;a++){
            arr[a]=sc.nextInt();
        }
        int min=arr[0];
        int max=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<min) {
                min = arr[i];
                for (int j = 0; j < arr.length-1; j++) {
                    if (arr[j] == min) {
                        for (int k = j + 1; k < arr.length-1; k++) {
                            if (arr[k] > max) {
                                max = arr[k];
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Buying Price="+min);
        System.out.println("Selling Price="+max);
        int profit=max-min;
        System.out.println("Profit="+profit);
    }
}
