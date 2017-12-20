package oop_lap6;
import java.util.StringTokenizer;

public class myStringToken {
    public static void main(String[] args) {
        String S = "Welcome to RMUSTV";
        StringTokenizer tokenizer = new StringTokenizer(S);
        // count word in String

        System.out.println(tokenizer.countTokens());
        // cut word in String
        // reverse word String
        while (tokenizer.hasMoreTokens()){
            StringBuffer buffer = new StringBuffer(tokenizer.nextToken());
            System.out.println(buffer.reverse());
        }



    }//main
}//class
