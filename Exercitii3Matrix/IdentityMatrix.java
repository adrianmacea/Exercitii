/*
 * Check whether the given matrix is an identity matrix.
 * A matrix is said to be an identity matrix if it is a square matrix 
 * in which elements of principle diagonal are ones, 
 * and the rest of the elements are zeroes.
 */

public class IdentityMatrix{
    public static void main(String[] args){
        int[][] a = {{1,0,0},{0,1,0},{0,0,1}};
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(i>j) System.out.print(a[i][j]+" ");
                if(i<j) System.out.print(a[i][j]+" ");
                if(i==j) System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
                
        if(isIdentityMatrix(a)){
            System.out.println("\nThis is an identity matrix.");
        }else{
            System.out.println("\nThis is not an identity matrix.");
        }
        
    }
    
    public static boolean isIdentityMatrix(int[][] m){
        if(m.length!=m[0].length){
            return false;
        }
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(i==j && m[i][j]!=1){
                    return false;
                }
                if(i!=j && m[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
}