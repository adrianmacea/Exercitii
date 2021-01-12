public class CopyArray{
    public static void main(String[] args){
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[arr1.length];
                
        System.out.print("Elements of the original arrey: ");
        for(int i:arr1) System.out.print(i+" ");
        
        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }
        
        System.out.print("\nElements of the second arrey: ");
        for(int i:arr2) System.out.print(i+" ");
        
    }
}