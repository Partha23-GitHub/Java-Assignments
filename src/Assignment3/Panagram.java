package Assignment3;

import java.util.*;

public class Panagram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        Set<Character>set=new HashSet<>();  //taking set for O(1) searching operation
        for(char ele='a';ele<='z';ele++){
            set.add(ele);
        }
        System.out.println(isPanagram(str.toLowerCase(),set));
    }
    static boolean isPanagram(String str,Set<Character>set){
        for(int i=0;i<str.length();i++){
            set.remove(str.charAt(i));
        }
        return set.size()==0;
    }
}