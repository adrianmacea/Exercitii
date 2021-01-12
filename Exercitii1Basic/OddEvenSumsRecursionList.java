/**
 * Get the sum of all even numbers and the sum of all odd numbers up to "n".
 */

import java.util.*;

public class OddEvenSumsRecursionList{
    static int evenSum, oddSum;
    static ArrayList<Integer> sum = new ArrayList<>();
        
    public static void main (String[] args){
        sum.add(0);
        sum.add(0);
        System.out.println(getSum(6));
    }
    
    static ArrayList<Integer> getSum(int n){
        if(n==0){
            return null;
        }else{
            if(n%2==0){
                evenSum+=n;
                sum.set(0, evenSum);
                getSum(--n);
            }else{
                oddSum+=n;
                sum.set(1, oddSum);
                getSum(--n);
            }
                        
            return sum;
        }
    }
        
}
