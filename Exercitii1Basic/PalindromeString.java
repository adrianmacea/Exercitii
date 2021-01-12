/**
 * A palindrome is the same after reverse. 
 * For example 545, 151, 34543, 343, 171, 48984 are palindrome numbers. 
 * It can also be a string like LOL, MADAM etc
 */

import java.util.Scanner;

public class PalindromeString{
    public static void main(String[] args){
        
        String original, reverse = "";
        
        Scanner in = new Scanner(System.in);
        System.out.println("Eneter a string of characters/numbers to check if it is a palindrome.");
        original = in.nextLine();
        int length = original.length();
        
        for(int i=length-1; i>=0; i--){
            reverse += original.charAt(i);
        }
        
        if(original.equals(reverse)){
            System.out.println("It is a palindrome.");
        }else{
            System.out.println("It's not a palindrome.");
        }
        
    }
}