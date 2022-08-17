package Assignment3;

import java.util.Scanner;

public class VowelsConsonants {
    static int vowels,consonants;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        countVowelsConsonants(str.toLowerCase());
        System.out.println(vowels+" Vowels, "+consonants+ " Consonants ");
    }
    static void countVowelsConsonants(String string){
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                vowels++;
            }
            else if(string.charAt(i) >= 'a' && string.charAt(i)<='z') {
                consonants++;
            }
        }
    }
}