public class MyClass{
    private int a, b;
    
    public MyClass(int a, int b){
        this.a=a;
        this.b=b;
    }
    
    @Override
    public boolean equals(Object o){
        if(o==this){
            return true;
        }
        if(!(o instanceof MyClass)){
            return false;
        }
        // typecast o to MyClass so that we can compare data members
        MyClass c = (MyClass) o; 
        return a==c.a && b==c.b;
    }
}