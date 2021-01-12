/**
 * Diamond pattern matrix 
 */

public class PrintPatternDiamond{
    
    public static void main(String[] args){
        int row=7;
        int i,j;
        
        for(i=0; i<row; i++){
            int countA=1;
            for(j=row-i; j>0; j--){
                System.out.print(countA++ +" ");
            }
            System.out.print(" ");
            
            for(j=0; j<=i; j++){
                System.out.print(" /");
            }
            System.out.print(" ");
            int countB=1;
            for(j=0; j<=i; j++){
                System.out.print(" "+ countB++);                
            }
            System.out.print("  ");
            
            for(j=row-i; j>0; j--){
                System.out.print(" -");
            }
            System.out.println();
        }
        
        for(i=0; i<row; i++){
            
            for(j=0; j<=i; j++){
                System.out.print("- ");                
            }
            System.out.print("  ");
            int countA=1;
            for(j=row-i; j>0; j--){
                System.out.print(countA++ +" ");
            }
            System.out.print(" ");
            
            for(j=row-i; j>0; j--){
                System.out.print("/ ");
            }
            System.out.print(" ");
            int countB=1;
            for(j=0; j<=i; j++){
                System.out.print(" "+ countB++);
            }
            System.out.println();
        }
    }
}
