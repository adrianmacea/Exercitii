/**
 * A palindrome is the same after reverse. 
 * For example 545, 151, 34543, 343, 171, 48984 are palindrome numbers. 
 * It can also be a string like LOL, MADAM etc
 */

import java.util.Scanner;

public class PalindromeNumber{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Eneter a number to check if it is a palindrome.");
        int n = s.nextInt();
        
        int r, sum=0, temp;
        
        temp=n;
        while(n>0){
            r=n%10;
                System.out.println("r is "+ r +"\n--------------------");
                
            sum=(sum*10)+r;
                System.out.println(" sum is "+ sum +"\n--------------------");
                
            n=n/10;
                System.out.println("  n is "+ n +"\n--------------------");
        }
        
        if(temp==sum){
            System.out.println("It is a palindrome number.");
        }else{
            System.out.println("It's not a palindrome number.");
        }
        
    }
}
