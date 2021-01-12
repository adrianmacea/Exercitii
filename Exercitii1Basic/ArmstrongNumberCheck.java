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

public class ArmstrongNumberCheck{
    
    static int sum=0;
    
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        
        if(isArmstrong(n)==true){
            System.out.println(n + " is an armstrong number");
        }else{
            System.out.println(n + " is not an armstrong number");
        }
        
    }
    
    static boolean isArmstrong(int n){
        if(n<0){
            return false;
        }
        
        int temp=n;
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