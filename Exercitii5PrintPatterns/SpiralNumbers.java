public class SpiralNumbers{
    public static void main(String[] args){
        int n = 5;
        int[][] matrix = new int[n][n];
        
        int i=1;
        int j=1;
        int k=0;
        int direction=1;
        
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                matrix[i][j]=0;
            }
        }

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(" "+matrix[i][j]+" ");
            }
            System.out.println();
        }

        j=0;
        
        for(i=1;i<n*n;i++){
            matrix[j][k]=i;
            if(direction==1)
                if(k+1<n)
                    if(matrix[j][k+1]==0)
                        k++;
                    else{
                        direction=2;
                    }
                else{
                    direction=2;
                }
            if(direction==2)
                if(j+1<n)
                    if(matrix[j+1][k]==0)
                        j++;
                    else{
                        direction=3;
                    }
                else{
                    direction=3;
                }
            if(direction==3)
                if(k-1>=0)
                    if(matrix[j][k-1]==0)
                        k--;
                    else{
                        direction=4;
                    }
                else{
                    direction=4;
                }
            if(direction==4)
                if(j-1>=0)
                    if(matrix[j-1][k]==0)
                        j--;
                    else{
                        i--;
                        direction=1;
                    }
                else{
                    direction=1;
                }
            
        }
        System.out.println();
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(" "+matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}