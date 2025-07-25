import java.util.*;
public class StringReplace{
    static void solution(String str,char ch1,char ch2){
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch1){
                res.append(ch2);
            }
            else if(str.charAt(i)==ch2){
                res.append(ch1);
            }
            else{
                res.append(str.charAt(i));
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        solution(str,ch1,ch2);
    }
}