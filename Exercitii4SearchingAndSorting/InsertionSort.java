/*
 * Insertion sort is a simple sorting algorithm that works similar 
 * to the way you sort playing cards in your hands. 
 * The array is virtually split into a sorted and an unsorted part. 
 * Values from the unsorted part are picked and placed at the correct position in the sorted part.
 * 
 */

public class InsertionSort{

    public static void main(String[] args){
        int[] arr = {7,4,1,9,8,2,6,3,5};
        
        System.out.print("Original array: ");
        for(int i:arr) System.out.print(" "+i);
        
        insertionSort(arr);
        
        System.out.print("\nInsertion sorted: ");
        for(int i:arr) System.out.print(" "+i);
    }
    
    public static void insertionSort(int[] arr){
        for(int j=1;j<arr.length;j++){
            int key = arr[j];
            int i = j-1;
            while((i>-1) && (arr[i]>key)){
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=key;
        }
    }
    
}
