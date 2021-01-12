/*
 * The product of two matrices can be computed by multiplying 
 * elements of the first row of the first matrix with 
 * the first column of the second matrix then, 
 * add all the product of elements. 
 * 
 * Continue this process until each row of the first matrix 
 * is multiplied with each column of the second matrix.
 * 
 * 1*2+3*1+2*1  1*1+3*0+2*3 1*1+3*1+2*1
 * 3*2+1*1+1*1  1*1+3*0+3*2 3*1+1*1+1*1
 * 2*2+2*1+2*1  1*1+2*0+2*3 1*1+2*1+2*1
 * 
 * Two matrices can be multiplied if and only if 
 * they satisfy the following condition:
 * The number of columns present in the first matrix 
 * should be equal to the number of rows present in the second matrix.
 * Suppose dimension of matrix A is i × j and matrix B is j × k, 
 * then the dimension of resulting matrix will be i × k.
 * 
 */

public class MultiplyMatrices{
    public static void main(String[] args){
        int[][] a = {{1,3,2},{3,1,1},{1,2,2}};
        int[][] b = {{2,1,1},{1,0,1},{1,3,1}};
        
        int row1 = a.length;
        int col1 = a[0].length;
        
        int row2 = b.length;
        int col2 = b[0].length;
        
        if(col1 != row2){
            System.out.println("Matrices cannot be multiplied");    
        }else{        
            int[][] prod = new int[row1][col2];
            
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    for(int k=0;k<row2;k++){
                        prod[i][j]+=a[i][k]*b[k][j];
                    }
                    System.out.print(prod[i][j]+" ");
                }
                System.out.println();
            }
        }
    
    }
}
