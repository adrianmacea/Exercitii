public class RotateElemLeft{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = 3;
        
        System.out.print("Original array:");
        for(int i:arr) System.out.print(" "+i);
        
        for(int i=0; i<n; i++){
            int j, first;
            first=arr[0];
            for(j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        
        System.out.print("\nArray left rotation: ");
        for(int i:arr) System.out.print(" "+i);
    }
}