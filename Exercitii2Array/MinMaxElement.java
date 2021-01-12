public class MinMaxElement{
    public static void main(String[] args){
        int[] arr = {10,2,3,41,5,6,77,8,9,5};
        int max = arr[0];
        int min = arr[0];
        
        System.out.print("Original array: ");
        for(int i:arr) System.out.print(" "+i);
        
        for(int i:arr){
            if(i>max) max=i;
            if(i<min) min=i;
        }
        System.out.print("\nMax element is "+max);
        System.out.print("\nMin element is "+min);
    }
}