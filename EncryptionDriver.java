import java.util.Scanner;
import java.util.Arrays;

public class EncryptionDriver{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //asks user to input a sentence 
        System.out.print("Type a sentence: ");
        String sent = scan.next();

        // Convert String to char array
        char[] sentence = sent.toCharArray();

        //creates encryption
        Encryption msg = new Encryption(sentence);

        // prints original sentence 
        String originalsent = new String(sentence);
        System.out.println();
        System.out.println(originalsent);

    }


}
