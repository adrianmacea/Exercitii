/*
 * Find the "zero" element(s) in the matrix. 
 * Make all elements in its row and column "zero".
 */

public class ZeroRowColumn{
    
    public static void main(String[] args){
        int[][] matrix = {{1,1,1,1,1},{1,0,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,0,1},{1,1,1,1,1}};
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        matrix = findZero(matrix);
                
        System.out.println();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
    public static int[][] findZero(int[][] m){
        
        int[][] m2 = new int[m.length][m[0].length];
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                m2[i][j]=m[i][j];
            }
        }
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]==0){
                    toZero(i,j,m2);
                }
            }
        }
        
        return m2;
    }
    
    public static void toZero(int row, int col, int[][] m){
        
        for(int i=0;i<m.length;i++){
            m[i][col]=0;
        }
        
        for(int i=0;i<m[0].length;i++){
            m[row][i]=0;
        }
        
    }
    
}
