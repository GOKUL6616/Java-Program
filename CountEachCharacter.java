import java.util.*;
public class CountEachCharacter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
    for (int i = 0; i < str.length(); i++) {
        int count = 1;
        char ch=str.charAt(i);
        if(str.indexOf(ch)!=i)
            continue;
        for (int j = i + 1; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)) {
                count++;

            }
        }
        System.out.println(str.charAt(i) + " = " + count);
    }
    }
}
