import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string of characters/numbers to check if it is a palindrome.");
        String s1 = in.nextLine();
        
        StringBuilder sb = new StringBuilder(s1);
        sb = sb.reverse();
                
        if(!s1.contentEquals(sb)) 
            System.out.print(" is not a palindrome");
        else 
            System.out.print(" is a palindrome");
        
    }

}