public class AscendingOrder{
    public static void main(String[] args){
        int[] arr = {4,6,1,9,2,3,8,5,7};
        int temp = 0;
        
        System.out.print("Original array: ");
        for(int i:arr) System.out.print(" "+i);
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        System.out.print("\nSorted in ascending order: ");
        for(int i:arr) System.out.print(" "+i);
    }
}