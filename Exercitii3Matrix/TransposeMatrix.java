/*
 * Find the transpose of the given matrix and print the resulting matrix.
 * 
 * Transpose of a matrix can be found by interchanging rows with the column.
 * That is, rows of the original matrix will become columns of the new matrix. 
 * Similarly, columns in the original matrix will become rows in the new matrix.
 */

public class TransposeMatrix{
    public static void main(String[] args){
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        
        int rows = m.length;
        int cols = m[0].length;
        
        int[][] t = new int[cols][rows];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               t[i][j] = m[j][i];
            }
        }
        
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
      
    }
}
