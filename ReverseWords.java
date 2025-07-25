import java.util.*;
public class ReverseWords {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder res1=new StringBuilder();
        StringBuilder res2=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                res1.append(str.charAt(i));
            }
            else if(str.charAt(i)==' '){
                break;
            }
        }
        for(int j=0;j<str.length();j++){
            if(str.charAt(j)==' '){
                for(int k=j+1;k<str.length();k++){
                    res2.append(str.charAt(k));
                }
            }
        }
        System.out.print(res2+" ");
        System.out.print(res1);
    }
}
