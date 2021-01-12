/**
 * In fibonacci series, next number is the sum of previous two numbers 
 * for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
 * The first two numbers of fibonacci series are 0 and 1.
 */

public class FibonacciFor{
    
    public static void main(String[] args){
        int i=0,j=1,s=0;
        int count=10;
        System.out.println(i+"\n"+j);
        
        for(int k=2; k<count; k++){
            s=i+j;
            System.out.println(s);
            i=j;
            j=s;
        }
        
    }

}