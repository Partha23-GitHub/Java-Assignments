package Assignment3;

import java.util.*;

public class Panagram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        Set<Character>set=new HashSet<>();
        System.out.println(isPanagram(str.toLowerCase(),set));
    }
    static boolean isPanagram(String str,Set<Character>set){
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        return set.size()==26;
    }
}