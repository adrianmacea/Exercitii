/*
 * calculate the sum of elements in each row and each column of the given matrix
 */

public class SumRowsColumns{
    public static void main(String[] args){
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        
        int rows = m.length;
        int cols = m[0].length;
        
        int[] arrRows = new int[rows];
        int[] arrCols = new int[cols];
        
        for(int i=0;i<rows;i++){
            int sumRow=0;
            int sumCol=0;

            for(int j=0;j<cols;j++){
                sumRow+=m[i][j];
                sumCol+=m[j][i];
                arrRows[i]=sumRow;
                arrCols[i]=sumCol;
            }

        }
        
        for(int i=0;i<rows;i++){
            System.out.println("Sum of "+(i+1)+" row: "+arrRows[i]);
        }
        System.out.println();
        for(int i=0;i<rows;i++){
            System.out.println("Sum of "+(i+1)+" column: "+arrCols[i]);
        }
    }
}
