/*
 * Lower triangular matrix is a square matrix in which 
 * all the elements above the principle diagonal will be zero.
 */

public class OddEvenFrequency{
    public static void main(String[] args){
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        int odd = 0;
        int even = 0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
        }
        System.out.println("Frequency of odd numbers: "+odd);
        System.out.println("Frequency of even numbers: "+even);
    }
}
