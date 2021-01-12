/**
 * Armstrong Number:
 * - it is a positive number
 * - it is equal to the sum of cubes of its digits 
 * 
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:  
 * (1*1*1)=1  
 * (5*5*5)=125  
 * (3*3*3)=27  
 * So:  
 * 1+125+27=153  
 * 
 */

import java.util.*;

public class ArmstrongNumberList{
    
    
    
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int start = s.nextInt();
        System.out.print("Enter the second number: ");
        int end = s.nextInt();
        System.out.println("List of armstrong numbers between "+ start + " and " + end);
        
        for(int i=start; i<=end; i++){
            if(isArmstrong(i)==true){
                System.out.println(i);
            }
        }
        
    }
    
    static boolean isArmstrong(int n){
        if(n<0){
            return false;
        }
        
        int temp=n;
        int sum=0;
        while(temp>0){
            int r=temp%10;
            sum+=(r*r*r);
            temp=temp/10;
        }
        if(sum!=n){
            return false;
        }
        
        return true;
    }
    
}
