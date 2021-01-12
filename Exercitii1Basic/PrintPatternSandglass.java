/**
 * Sandglass pattern matrix 
 */

public class PrintPatternSandglass{
    
    public static void main(String[] args){
        int row=9;
        int i,j;
        
        for(i=0; i<row; i++){
            
            for(j=0; j<=i; j++){
                System.out.print(":");
            }
            System.out.print("  ");
            
            for(j=row-i; j>0; j--){
                System.out.print(j+ " ");
            }
            System.out.print(" ");
            
            for(j=0; j<=i; j++){
                System.out.print(":");
            }
            System.out.println();
            
        }
        
        
        for(i=0; i<row; i++){
            
            for(j=row-i; j>0; j--){
                System.out.print(":");
            }
            System.out.print("  ");
            
            for(j=1; j<=i+1; j++){
                System.out.print(j +" ");
            }
            System.out.print(" ");
            
            for(j=row-i; j>0; j--){
                System.out.print(":");
            }
            System.out.println();
            
        }
        
    }
}
