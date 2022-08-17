package Assignment3;

import java.util.Scanner;

public class PreservingPosition {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        String[]strChar=str.split(" ");
        StringBuilder ans=new StringBuilder();
        for (String s:strChar) {
            StringBuilder sb=new StringBuilder(s.toLowerCase()).reverse();
            ans.append(sb).append(" ");

        }
        System.out.println(ans);
    }
}
