/*
 * Binary search is used to search a key element from multiple elements. 
 * Binary search is faster than linear search.
 * 
 * In case of binary search, array elements must be in ascending order. 
 * If you have unsorted array, you can sort the array using Arrays.sort(arr) method.
 */

import java.util.Arrays;

public class BinarySearch{
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,5};
        int key = 5;
        int last = arr.length-1;
        
        binarySearch(arr,0,last,key);
    }
    
    public static void binarySearch(int[] arr, int first, int last, int key){
        Arrays.sort(arr);
        int mid = (first+last)/2;
        while(first<=last){
            if(arr[mid]<key){
                first=mid+1;
            }else if(arr[mid]==key){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        if(first>last){
            System.out.println("Element is not found");
        }
    }
    
}