import java.util.*;
public class CheckSubstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    res.append(str1.charAt(i));
                }
            }
        }
        System.out.println(res);
        }
    }

