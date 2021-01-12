public class RemoveDuplicatesA{
    public static void main(String[] args){
        int[] arr ={1,4,5,7,3,1,3,4,1,9,1,4,8,1};
        
        System.out.print("Original array: ");
        for(int i:arr) System.out.print(" "+i);
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=-1;
                }
            }
        }
        
        System.out.print("\nEdited array - removed duplicates: ");
        for(int i:arr) if(i!=-1) System.out.print(" "+i);
    }
}