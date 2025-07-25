import java.util.*;
public class SubArrayGroupReverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[num];
        for(int a=0;a<num;a++){
            arr[a]=sc.nextInt();
        }
        int ind=0;
        for(int i=k-1;i<num;i=i+k) {
            for (int j = i; j >= ind; j--) {
                System.out.print(arr[j]+" ");
            }
            ind = ind + k;
        }
    }
}
