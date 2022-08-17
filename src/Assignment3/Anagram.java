package Assignment3;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String s1="anagram";
        String s2="nagaram";
        char[]arr1=s1.toCharArray();
        Arrays.sort(arr1);
        char[]arr2=s2.toCharArray();
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2) ? "Anagram" : "Not Anagram");

    }
}
