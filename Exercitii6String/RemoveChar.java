import java.util.*;

public class RemoveChar{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("The program will remove a character at a specified location.");
        System.out.println("\nEnter a few words.");
        String s = in.nextLine();
        System.out.println("Enter a number (the position of the character you want removed).");
        int n = in.nextInt();
        
        System.out.println(removeCharAt(s, n));
        
    }

    public static String removeCharAt(String str, int n){
        str = str.substring(0,n)+" "+str.substring(n+1);
        return str;
    }
}
