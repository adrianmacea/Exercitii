import java.util.*;

public class Anagram{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("This program will check if two given strings are anagrams.");
        System.out.println("Enter the first string:");
        String s1 = in.nextLine();
        System.out.println("Enter the second string:");
        String s2 = in.nextLine();
                
        System.out.println(isAnagram(s1, s2));  
        
    }

    public static boolean isAnagram(String str1, String str2){
        str1.strip();
        str2.strip();
        
        if(str1.length()!=str2.length()){
            return false;
        }
        
        int length = str1.length();
        char temp = ' ';
        
        char[] arr1 = str1.toLowerCase().toCharArray();
        Arrays.parallelSort(arr1);
        
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.parallelSort(arr2);
        
        if(!Arrays.equals(arr1,arr2)){
            return false;
        }
        
        return true;
    }
}
