import java.util.Scanner;

public class CapitalizeWords2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a few words. The program will capitalize first letter for each of them.");
        StringBuilder sb = new StringBuilder(in.nextLine());
        
        System.out.println(capitalizeWord(sb));
        
    }

    public static StringBuilder capitalizeWord(StringBuilder str){
        
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i-1)==' '){
                String s = Character.toUpperCase(str.charAt(i))+"";
                str.replace(i, i+1, s);
            }else{
                String s = Character.toLowerCase(str.charAt(i))+"";
                str.replace(i, i+1, s);
            }
        }
        
        String s = Character.toUpperCase(str.charAt(0))+"";
        str.replace(0, 1, s);
        
        return str;
    }
}
