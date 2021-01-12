/**
 * Get the sum of all even numbers and the sum of all odd numbers up to "n".
 */

import java.util.*;

class OddEvenSumsFor{
    
    public static void main(String[] args){
        System.out.println(getSum(6));
    }
    
    static ArrayList<Integer> getSum(int n){
        
        ArrayList<Integer> sum = new ArrayList<>();
        int evenSum = 0;
        int oddSum = 0;
        
        for(int i=1; i<=n; i++){
            if(i%2==0){
                evenSum += i;
            }else{
                oddSum += i;
            }
        }
        
        sum.add(evenSum);
        sum.add(oddSum);
        
        return sum;
    }
    
}