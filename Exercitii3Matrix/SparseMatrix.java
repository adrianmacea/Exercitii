/*
 * Check whether the given matrix is a sparse matrix.
 * A matrix is said to be a sparse matrix if most of the elements of that matrix are 0. 
 * count of zero elements present in an array must be greater than size/2. 
 */

public class SparseMatrix{
    public static void main(String[] args){
        int[][] a = {{1,0,2},{0,3,0},{0,0,5}};
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
                
        if(isSparseMatrix(a)){
            System.out.println("\nThis is a sparse matrix.");
        }else{
            System.out.println("\nThis is not a sparse matrix.");
        }
        
    }
    
    public static boolean isSparseMatrix(int[][] m){
        int zeros = 0;
        int nonZeros = 0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]==0){
                    zeros++;
                }else{
                    nonZeros++;
                }
            }
        }
        if(zeros<nonZeros){
            return false;
        }
        return true;
    }
}
