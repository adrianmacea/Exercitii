import java.util.*;

public class RemoveLeadZeros{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("The program will remove the leading zeros from a string.");
        System.out.println("Enter a big number with a few leading zeros.");
        String s = in.nextLine();
        
        StringBuilder sb = new StringBuilder(s);
        
        System.out.println(removeLeadingZero(sb));
        
    }

    public static StringBuilder removeLeadingZero(StringBuilder sb){        
        
        if(sb.charAt(0)=='0'){
            removeLeadingZero(sb.deleteCharAt(0));
        }
        
        return sb;
    }
}
