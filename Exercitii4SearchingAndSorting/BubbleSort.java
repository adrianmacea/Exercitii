/*
 * Bubble sort algorithm is known as the simplest sorting algorithm. 
 * In bubble sort algorithm, array is traversed from first element to last element. 
 * Here, current element is compared with the next element. 
 * If current element is greater than the next element, it is swapped.
 * 
 */

public class BubbleSort{

    public static void main(String[] args){
        int[] arr = {7,4,1,9,8,2,6,3,5};
        
        System.out.print("Original array: ");
        for(int i:arr) System.out.print(" "+i);
        
        bubbleSort(arr);
        
        System.out.print("\nBubble sorted: ");
        for(int i:arr) System.out.print(" "+i);
    }
    
    public static void bubbleSort(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    
}
