/*
 * Selection sort selects i-th smallest element and places at i-th position. 
 * This algorithm divides the array into two parts: sorted (left) and unsorted (right) subarray. 
 * It selects the smallest element from unsorted subarray and places 
 * in the first position of that subarray (ascending order). 
 * It repeatedly selects the next smallest element..
 * 
 */

public class SelectionSort{

    public static void main(String[] args){
        int[] arr = {7,4,1,9,8,2,6,3,5};
        
        System.out.print("Original array: ");
        for(int i:arr) System.out.print(" "+i);
        
        selectionSort(arr);
        
        System.out.print("\nSelection sorted: ");
        for(int i:arr) System.out.print(" "+i);
    }
    
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j; //searching for lowest index
                }
            }
            int smallerNumber=arr[index];
            arr[index]=arr[i];
            arr[i]=smallerNumber;
        }
    }
    
}
