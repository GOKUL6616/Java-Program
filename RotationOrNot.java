import java.util.*;
public class RotationOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        StringBuilder res1=new StringBuilder();
        StringBuilder res2=new StringBuilder();
        StringBuilder Finalres=new StringBuilder();

        int index=str1.length()/2;
        for(int i=0;i<index;i++){
            for(int j=index;j<str2.length();j++){
               if(str1.charAt(i)==str2.charAt(j)){
                   res1.append(str1.charAt(i));
               }
            }
        }
        for(int i=index;i<str1.length();i++){
            for(int j=0;j<index;j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    res2.append(str1.charAt(i));
                }
            }
        }
        Finalres.append(res2);
        Finalres.append(res1);
        String out=Finalres.toString();

       if(str2.equals(out)==true){
          System.out.println("True");
     }
       else{
           System.out.println("False");
       }
    }
}
