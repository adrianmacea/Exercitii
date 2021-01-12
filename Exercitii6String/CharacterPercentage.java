import java.util.Scanner;

public class CharacterPercentage{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a few words. The program will find the percentage of \nuppercase, lowercase, digits and special characters.");
        String s = in.nextLine();
        
        double[] percentages = characterPercentage(s);
        
        System.out.println("Uppercase letters are "+ percentages[0] +"%");
        System.out.println("Lowercase letters are "+ percentages[1] +"%");
        System.out.println("Digits are "+ percentages[2] +"%");
        System.out.println("Other characters are "+ percentages[3] +"%");
    }

    public static double[] characterPercentage(String str){
        
        int length = str.length();
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int other = 0;
        
        for(int i=0; i<length; i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                upperCase++;
            }else if(Character.isLowerCase(ch)){
                lowerCase++;
            }else if(Character.isDigit(ch)){
                digits++;
            }else{
                other++;
            }
        }
        
        double[] percentages = {(upperCase*100)/length, (lowerCase*100)/length, (digits*100)/length, (other*100)/length};
        
        return percentages;
    }
}
