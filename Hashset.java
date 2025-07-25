import java.util.*;
import java.util.HashSet;
public class Hashset {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int a=0;a<num;a++){
            arr[a]=sc.nextInt();
        }
        HashSet<Integer> hash=new HashSet<>();
        HashSet<Integer> hash2 =new HashSet<>();
        for(int i=0;i<num;i++){
            if(!hash.add(arr[i])){
                hash2.add(arr[i]);
            }

        }
        System.out.println(hash2);
    }
}
