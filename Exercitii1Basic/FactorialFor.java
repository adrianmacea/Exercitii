/**
 * Factorial of n is the product of all positive descending integers. 
 * Factorial of n is denoted by n!.
 * For example:
 * 4! = 4*3*2*1 = 24 
 * 5! = 5*4*3*2*1 = 120 
 * 
 * Here, 4! is pronounced as "4 factorial", it is also called "4 bang" or "4 shriek".
 * The factorial is normally used in Combinations and Permutations (mathematics).
 */

public class FactorialFor{
    
    public static void main(String[] args){
        factorial(6);
    }
    
    static void factorial(int n){
        int p=1;
        for(int count=1; count<=n; count++){
            p*=count;
            System.out.println(p);
        }
    }
}