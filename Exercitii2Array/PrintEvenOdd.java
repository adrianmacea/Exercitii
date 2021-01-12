public class PrintEvenOdd{

    public static void main(String[] args){
        int[] arr ={1,4,5,7,3,1,3,4,1,9,1,4,8,2,0};

        System.out.print("Original array: ");
        for(int i:arr) System.out.print(" "+i);

        System.out.print("\nEven elements: ");
        for(int i:arr){
            if(i%2==0){
                System.out.print(" "+i);
            }
        }

        System.out.print("\nOdd elements: ");
        for(int i:arr){
            if(i%2!=0){
                System.out.print(" "+i);
            }
        }

    }

}