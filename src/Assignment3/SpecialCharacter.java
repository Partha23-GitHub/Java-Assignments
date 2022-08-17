package Assignment3;

import java.util.Scanner;

public class SpecialCharacter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        System.out.println(noOfSpecialCharacter(str,0));
    }

    private static int noOfSpecialCharacter(String str,int specialCharacter) {
        for(int i=0;i<str.length();i++){
            if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
                specialCharacter++;
            }
        }
        return specialCharacter;
    }
}
