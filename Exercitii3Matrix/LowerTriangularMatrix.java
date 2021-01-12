/*
 * Lower triangular matrix is a square matrix in which 
 * all the elements above the principle diagonal will be zero.
 */

public class LowerTriangularMatrix{
    public static void main(String[] args){
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(j>i){
                    System.out.print("0 ");
                }else{
                    System.out.print(m[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}