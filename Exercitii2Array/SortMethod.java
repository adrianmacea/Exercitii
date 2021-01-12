import java.util.Arrays;

public class SortMethod{
    public static void main(String[] args){
        int[] arr = {4,6,1,9,2,3,8,5,7};
        
        //use the toSting() method of the java.util.Arrays class to print the array
        System.out.print("Original array: "+Arrays.toString(arr));
        
        //use the sort() method of the java.util.Arrays class to sort an array in ascending order
        Arrays.sort(arr);
        
        System.out.print("\nSorted in ascending order: "+Arrays.toString(arr));
                
    }
}