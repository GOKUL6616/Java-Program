import java.util.*;
public class ToggleCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++){
             char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                res.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)){
                res.append(Character.toUpperCase(ch));

            }
        }
        System.out.println(res);
        }

    }
