import java.util.*;
public class StringReverseUsingStack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
