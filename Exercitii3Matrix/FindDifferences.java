/*
 * Two matrices are said to be equal if and only if 
 * they satisfy the following conditions:
 * 
 * - have the same number of rows and columns
 * - have the same corresponding elements
 * 
 */

public class FindDifferences{
    public static void main(String[] args){
        int[][] m1={{1,2,7},{8,4,6},{4,8,7}};
        int[][] m2={{9,2,3},{8,4,6},{4,5,1}};
        
        System.out.println("Are the matrices equal?");
        findDifferences(m1,m2);
    }
    
    public static boolean areEqual(int[][]a, int[][]b){
        if(a.length!=b.length || a[0].length!=b[0].length){
            return false;
        }else{
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    if(a[i][j]!=b[i][j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public static void findDifferences(int[][]a, int[][]b){
        if(!areEqual(a,b)){
            System.out.println("No, because:");
            if(a.length!=b.length){
                System.out.println("Matrices don't have the same number of rows: "+a.length+" vs "+b.length);
            }
            if(a[0].length!=b[0].length){
                System.out.println("Matrices don't have the same number of columns: "+a[0].length+" vs "+b[0].length);
            }
            if(a.length==b.length && a[0].length==b[0].length){
                for(int i=0;i<a.length;i++){
                    for(int j=0;j<a[0].length;j++){
                        if(a[i][j]!=b[i][j]){
                            System.out.println("index["+i+"]["+j+"] has different values: "+a[i][j]+" vs "+b[i][j]);
                        }
                    }
                }
            }
        }else{
            System.out.println("Yes, the two matrices are equal.");
        }
    }
}
