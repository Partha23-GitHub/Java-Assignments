package Assignment3;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        String reverseString=reverse(str,str.length());
        System.out.println(reverseString);
    }
    static String reverse(String str,int length){
        if(length==0) return " ";
        if(length==1) return str;
        StringBuilder sb=new StringBuilder();   // stringBuilder just for avoiding unnecessary string objects
        for(int i=length-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}