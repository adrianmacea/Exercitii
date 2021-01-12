import java.util.Scanner;

public class ReverseWords{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a few words. The program will reverse each of them.");
        String s = in.nextLine();
                
        System.out.println(reverseWord(s));        
    }

    public static String reverseWord(String str){
        String[] arr = str.split(" ");
        
        String rezultat = "";
        for(String i: arr){
            StringBuilder sb = new StringBuilder(i);
            sb.reverse();
            rezultat += sb.toString()+" ";
        }
        
        return rezultat.trim();
    }
}
