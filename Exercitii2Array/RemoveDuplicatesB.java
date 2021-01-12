public class RemoveDuplicatesB{
        
    public static void main(String[] args){
        int[] array ={1,4,5,7,3,1,3,4,1,9,1,4,8,2};
                
        System.out.print("Original array: ");
        for(int i:array) System.out.print(" "+i);
        
        int[] newArray = removeDuplicates(array);
        
        System.out.print("\nNew array with duplicates removed: ");
        for(int i:newArray) System.out.print(" "+i);
    }
        
    public static int[] removeDuplicates(int arr[]){
        int count = 0;
        int n=9;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                n--;
                i=0;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=n;
                }
            }
        }
        
        for(int i:arr){
            if(i==n){
                count++;
            }
        }
        
        int[] newArr = new int[arr.length-count];
        int j=0;
        for(int i:arr){
            if(i!=n){
                newArr[j++]=i;
            }
        }
        
        return newArr;
    }
    
}
