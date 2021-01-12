public class SumElements{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,35,4,5,6,7,8,9,0};
        int sum=0;
        
        System.out.print("Original array:");
        for(int i:arr) System.out.print(" "+i);
        
        for(int i:arr) sum+=i;
        
        System.out.println("\nSum is "+sum);
    }
}
