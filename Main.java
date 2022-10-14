import javax.sound.midi.Soundbank;
import java.util.*;
public class Main {
    public static void count_lowercase_vowels(String str)
    {
        char ch;
        int count_lower_case_vowels=0;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count_lower_case_vowels++;
            }
        }
        System.out.println("NUmber of lower_case_vowels"+ " "+ count_lower_case_vowels);



    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str2;
        System.out.println("Enter your String ----");
        str2= sc.nextLine();
        count_lowercase_vowels(str2);

        System.out.println("STAY WITH ME ALWAYS--------");
    }
}