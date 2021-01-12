/**
 * Get the sum of all even numbers and the sum of all odd numbers up to "n".
 */

import java.util.*;

public class OddEvenSumsRecursionArray{
    
    static int[] sum = {0,0};
        
    public static void main (String[] args){
        aduna(6);
        System.out.print(sum[0] +" "+ sum[1]);
    }
    
    static void aduna(int n){
        if(n==0){
            return;
        }else{
            if(n%2==0){
                sum[0]+=n;
                aduna(--n);
            }else{
                sum[1]+=n;
                aduna(--n);
            }
        }
    }
        
}
