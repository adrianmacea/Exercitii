public class RemoveDuplicatesC{
        
    public static void main(String[] args){
        int[] array ={1,4,5,7,3,1,3,4,1,9,1,4,8,1};
                
        System.out.print("Original array: ");
        for(int i:array) System.out.print(" "+i);
        
        int[] newArray = removeDuplicates(array);
        
        System.out.print("\nNew array with duplicates removed: ");
        for(int i:newArray) System.out.print(" "+i);
    }
        
    public static int[] removeDuplicates(int arr[]){
        boolean exista;
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            exista = false;
            for(int j=0;j<i-1;j++){
                if(arr[i]==arr[j]){
                    exista = true;
                }
            }
            
            if(exista == false){
                count++;
            }
            
        }
        
        int[] newArr = new int[count];
        count=0;
        for(int i=0;i<arr.length;i++){
            exista = false;
            for(int j=0;j<i-1;j++){
                if(arr[i]==arr[j]){
                    exista = true;
                }
            }
            
            if(exista == false){
                newArr[count++]=arr[i];
            }
            
        }
        
        return newArr;        
    }
    
}
