/*
 * Linear search is used to search a key element from multiple elements. 
 * Linear search is less used today because it is slower 
 * than binary search and hashing.
 * 
 */

public class LinearSearch{
    
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9,5};
        int key = 5;
        
        linearSearch(a,key);
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