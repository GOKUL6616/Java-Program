import java.util.*;
public class Arraylist {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        int sum=0;
        for(int i=1;i<=num;i++) {
            arr.add(i);
        }
        System.out.println(arr.get(5));
        arr.set(2,100);
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);
        boolean a=arr.contains(7);
        System.out.println(a);
        System.out.println(arr.size());
        System.out.println(arr.isEmpty());
        Collections.sort(arr);
        System.out.println(arr);
    }
}
