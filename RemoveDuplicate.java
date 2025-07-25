import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(res.indexOf(String.valueOf(ch))==-1){
                res.append(ch);
            }
        }
        System.out.println(str);
        System.out.println(res.toString());
    }
}
