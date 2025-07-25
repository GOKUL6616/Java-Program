import java.util.*;
public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowel = 0;
        int consonants = 0;
        String str1 = str.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {
                vowel++;
            } else if (str.charAt(i) == ' ') {
                continue;
            } else {
                consonants++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonants);
    }
}

