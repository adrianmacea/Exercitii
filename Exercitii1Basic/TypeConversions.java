public class TypeConversions{
    public static void main(String[] args){
        
        //widening
        byte b = 99;
        short s = b;
        int i = s; //or b
        long l = i; //or s, b
        float f = l; //or i, s, b
        double d = f; //or l, i, s, b
        
        char c = 'A';
        int i3 = c; // similar for long, float and double
                
        //narrowing
        double d2 = 123456789.0123456789;
        float f2 = (float)d2;
        long l2 = (long)f2; //or d2
        int i2 = (int)l2; //or f2, d2
        short s2 = (short)i2; //or l2, f2, d2
        byte b2 = (byte)s2; //or i2, l2, f2, d2
        
        char c2 = (char)b2; //or s2, i2, l2, f2, d2
        
        char c1 = 'L';
        byte b3 = (byte)c1;
        short d3 = (short)c1;
        
        //Clase Wrapper 
        //boxing
        Byte objByte = b;
        Short objShort = s;
        Integer objInt = i;
        Long objLong = l;
        Float objFloat = f;
        Double objDouble = d;
        Character objChar = c;
        boolean bo = true;
        Boolean objBoolean = bo;
        
        //unboxing
        int newInt = objInt; //... same for other types
        
        //primitive to String conversion:
        String str1 = objInt.toString(); 
        String str2 = objBoolean.toString(); //... same for other types
        
        //String to primitive conversion:
        String str3 = "104";
        byte bx = Byte.parseByte(str3);
        short sx = Short.parseShort(str3);
        int ix = Integer.parseInt(str3);
        long lx = Long.parseLong(str3);
        float fx = Float.parseFloat(str3);
        double dx = Double.parseDouble(str3);
        
        char cx = str3.charAt(0);
        
        System.out.println(str3+104); //104104
        System.out.println(ix+104); //208
        System.out.println(b3); //76
        
    }
}