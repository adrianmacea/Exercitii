/* 
 * Rroblem: You have a sorted array.
 * Remove duplicates, shift elements to the left, change duplicate elements to zero.
 * Return the number of valid elements.
 */

import java.util.*;

public class CountUniqueElem{

    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,4,4,5,5,6,7,7,7,7,7,8,8,9};
        
        int count = 0;
        
        for(int i=1;i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                arr[count]=arr[i-1];
                count++;
            }
        }
        
        arr[count]=arr[arr.length-1];
        
        for(int i=count+1; i<arr.length; i++){
            arr[i]=0;
        }
        
        for(int i: arr){
            System.out.print(i +",");
        }
        
        System.out.print("\n\nThere are "+(count+1)+" unique elements.");
        
    }
}