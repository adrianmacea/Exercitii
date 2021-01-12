import java.util.*;

public class DuplicateCharacters{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a few words. The program will count the occurances of each character.");
        String s = in.nextLine();
        
        duplicateCharacters(s);
        
    }

    public static void duplicateCharacters(String str){
        
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<length; i++){
            
            int count = 0;            
            for(int j=0; j<length; j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            
            String s = str.charAt(i)+"";
            if(sb.indexOf(s) == -1){
                System.out.println(str.charAt(i) +" occurances: "+ count);
            }
            sb = sb.append(s);
            
        }
        
    }
}
