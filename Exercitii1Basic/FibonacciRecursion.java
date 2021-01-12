/**
 * In fibonacci series, next number is the sum of previous two numbers 
 * for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
 * The first two numbers of fibonacci series are 0 and 1.
 */

public class FibonacciRecursion{    
    
    public static void main(String[] args){
        int count = 10;
        fibo(count,0,1);
    }
    
    static void fibo(int count, int i, int j){
        if(count==0){
            return;
        }else{
            System.out.println(i);
            fibo(--count,j,i+j);
        }
    }
}