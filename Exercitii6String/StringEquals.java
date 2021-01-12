/*
 * metoda equals() din clasa object compara referinta celor doua obiecte, este echivalenta cu "=="
 * x.equals(y) returns true if x and y refer to the same object (x == y has the value true)
 * 
 * dar metoda este suprascrisa in clasa String, astfel incat nu mai compara referinta ci valoarea stringurilor,
 * adica, same sequence of characters
 */

public class StringEquals{
    public static void main(String[] args){
        StringBuffer s1 = new StringBuffer("Lorem"); 
        StringBuffer s2 = new StringBuffer("Lorem"); 
        System.out.println("2sBuffer equals() -> "+ s1.equals(s2)); //false - referinte diferite (in heap)
        System.out.println("2sBuffer    ==    -> "+ (s1==s2)); //false - referinte diferite (in heap)
        
        StringBuilder s3 = new StringBuilder("Lorem"); 
        StringBuilder s4 = new StringBuilder("Lorem"); 
        System.out.println("\n2sBuilder equals() -> "+ s3.equals(s4)); //false - referinte diferite (in heap)
        System.out.println("2sBuilder    ==    -> "+ (s3==s4)); //false - referinte diferite (in heap)
        
        String s5 = new String("Lorem"); 
        String s6 = new String("Lorem"); 
        System.out.println("\n2sNew equals() -> "+ s5.equals(s6)); //true - aceeasi valoare (character sequence) 
        System.out.println("2sNew    ==    -> "+ (s5==s6)); //false - referinte diferite (in heap)
        
        String s7 = "Lorem"; 
        String s8 = "Lorem"; 
        System.out.println("\n2sLiteral equals() -> "+ s7.equals(s8)); //true - aceeasi valoare (character sequence)
        System.out.println("2sLiteral    ==    -> "+ (s7==s8)); //true - aceeasi referinta (in constant pool)
        
        System.out.println("\n\nsLiteral+sNew equals() -> "+ s8.equals(s5)); //true - aceeasi valoare (character sequence)
        System.out.println("sLiteral+sNew    ==    -> "+ (s8==s5)); //false - referinte diferite (in heap vs pool)
        
        
        System.out.println("\nsLiteral+sBuffer equals() -> "+ s8.equals(s1)); //false
        System.out.println("sNew+sBuffer equals() -> "+ s5.equals(s1)); //false
        /*
         * mai intai verifica daca e null, apoi verifica daca e aceeasi clasa, adica string,
         * daca argumentul nu e string rezultatul e fals intotdeauna,
         * nu converteste argumentul la string
         */
        
    }
}