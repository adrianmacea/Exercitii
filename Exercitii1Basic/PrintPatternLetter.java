/**
 * Letter pattern matrix 
 */

public class PrintPatternLetter{
    
    public static void main(String[] args){
        int n=8;
        int i,j;
        
        for(i=0; i<n; i++){
            
            for(j=0;j<=n/2;j++){
                //prints 2 vertical lines
                if((j==0 || j==n/2) && i!=0 || 
                //prints first line
                (i==0 && j!=n/2) || 
                //prints middle line
                i==n/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
        
    }
}
