public class EqualsOverride{
    public static void main(String[] args){
        MyClass c1 = new MyClass(3,5);
        MyClass c2 = new MyClass(3,5);
        
        System.out.println(c1.equals(c2));
    }
}