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

public class FactorialRecursion{
    
    public static void main(String[] args){
        factorialIncr(1,1);
        System.out.println("-----------------------");
        System.out.println(factorialAlt(6));
    }
    
    static void factorialIncr(int n, int p){
        if(n>6){
            return;
        }else{
            System.out.println(p);
            factorialIncr(++n,p*=n);
        }
    }
    
    static int factorialAlt(int n){
        if(n==1){
            return 1;
        }else{
            return n*factorialAlt(--n);
        }
    }
    
}
