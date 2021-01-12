public class IncrementalSumFor{
    
    public static void main (String[] args){
        sum(10);
    }
    
    public static void sum(int n){
        int s=0;
        for(int i=1;i<=n;++i){
            s+=i;
            System.out.println(s);
        }
    }
    
}
