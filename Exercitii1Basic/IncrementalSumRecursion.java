public class IncrementalSumRecursion{
    
    public static void main (String[] args){
        sumaIncr(0,0);
        System.out.println("-----------------------");
        sumaDecr(11,0);
        System.out.println("-----------------------");
        System.out.println(sumaAlt(10));
    }
    
    static void sumaIncr(int i, int s){
        if(i>10){
            return;
        }else{
            System.out.println(s);
            sumaIncr(++i,s+=i);
        }
    }
    
    static void sumaDecr(int i, int s){
        if(i==0){
            return;
        }else{
            System.out.println(s);
            sumaDecr(--i,s+=i);
        }
    }
    
    static int sumaAlt(int i){
        if(i==0){
            return 0;
        }else{
            return i+sumaAlt(i-1);
        }
    }
    
}
