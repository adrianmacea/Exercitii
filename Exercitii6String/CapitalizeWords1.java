import java.util.Scanner;

public class CapitalizeWords1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a few words. The program will capitalize first letter for each of them.");
        String s = in.nextLine();
        
        System.out.println(capitalizeWord(s));
        
    }

    public static String capitalizeWord(String str){
        String[] arr = str.split(" ");
        
        String rezultat = "";
        
        for(String i: arr){
            String s1 = i.substring(0,1);
            String s2 = i.substring(1);
            rezultat += s1.toUpperCase()+s2.toLowerCase()+" ";
        }
        
        return rezultat.trim();
    }
}
