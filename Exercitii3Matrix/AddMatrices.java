public class AddMatrices{
    public static void main(String[] args){
        int[][] a = {{1,3,4},{2,4,3},{3,4,5},{6,1,2}};
        int[][] b = {{1,3,4},{2,4,3},{1,2,4},{3,5,7}};
        
        int rows = a.length;
        int cols = a[0].length;
        
        int[][] c = new int[rows][cols];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    
    }
}