/*
 * Linear search is used to search a key element from multiple elements. 
 * Linear search is less used today because it is slower 
 * than binary search and hashing.
 * 
 */

import java.util.Scanner;

public class LinearSearchScanner{
    
    public static void main(String[] args){
        int n, key, arr[];
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total number of elements");
        n = in.nextInt();
        arr = new int[n];
        
        System.out.println("Enter those "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        
        System.out.println("Enter value to find");
        key = in.nextInt();
        
        linearSearch(arr,key);
    }
    
    public static void linearSearch(int[] arr, int key){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                count++;
                System.out.println(key+" is present at index "+i);
            }
        }
        if(count==0){
            System.out.println(key+" is not present in this array.");
        }else{
            System.out.println("\nElement "+key+" was found "+count+" times.");
        }
    }
}
