import java.util.Arrays;
import java.util.Collections; 

public class ReverseOrderMethod{
    public static void main(String[] args){
        
        /*
         * We have defined an array as Integer because 
         * the reverseOrder() method does not work for the primitive data type.
         */
        Integer[] arr = {4,6,1,9,2,3,8,5,7};
        
        //use the toSting() method of the java.util.Arrays class to print the array
        System.out.print("Original array: "+Arrays.toString(arr));
        
        /*
         * use the reverseOrder() method of the java.util.Collections class 
         * to sort an array in reverse-lexicographic order
         */
        Arrays.sort(arr, Collections.reverseOrder());
        
        System.out.print("\nSorted in ascending order: "+Arrays.toString(arr));
                
    }
}
