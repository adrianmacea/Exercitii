public class Print3dLargest{
    public static void main(String[] args){
        int[]arr={5,9,1,7,2,4,8,6,3};
        int temp=0;
        
        System.out.print("Original array: ");
        for(int i:arr) System.out.print(" "+i);
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        System.out.print("\nSorted in descending order: ");
        for(int i:arr) System.out.print(" "+i);
        
        System.out.print("\n3rd largest element is: "+arr[2]);
    }
}