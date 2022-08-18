package Assignment3;

public class RepeatedlyOccurringCharacters {
    public static void main(String[] args) {
        String s="iNeuronO";
        String newString=s.toLowerCase();

        for(int i=0;i<newString.length();i++){
            for(int j=i+1;j<newString.length();j++){
                if(newString.charAt(i)==newString.charAt(j))
                    System.out.println("Repeated Char :"+newString.charAt(j));
            }
        }
    }
}
