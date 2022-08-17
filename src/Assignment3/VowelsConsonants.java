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
    static void countVowelsConsonants(String str){
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowels++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
                consonants++;
            }
        }
    }
}