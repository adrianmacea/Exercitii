public class RotateElemRight{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = 3;
        
        System.out.print("Original array: ");
        for(int i:arr) System.out.print(" "+i);
        
        for(int i=0; i<n; i++){
            int j, last;
            last=arr[arr.length-1];
            for(j=arr.length-1; j>0; j--){
                arr[j]=arr[j-1];
            }
            arr[j]=last;
        }
        
        System.out.print("\nArray rotate right: ");
        for(int i:arr) System.out.print(" "+i);
    }
}