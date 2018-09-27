import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Encryption{
    Scanner scan = new Scanner(System.in);
    Random r = new Random();
    // values are 0 1 2 3...
    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    // makes copy of array
    char[] randAlpha = Arrays.copyOf(alphabet, alphabet.length);


    public Encryption(char[] arr){ 
        Random r = new Random(); 
        //randomizes array
        for (int i = randAlpha.length-1; i > 0; i--) {  
            int j = r.nextInt(25); 
            char temp = randAlpha[i]; 
            randAlpha[i] = randAlpha[j]; 
            randAlpha[j] = temp; 
        }
        //randomizes the user input 
        for (int i = arr.length-1; i > 0; i--) {  
            int j = r.nextInt(arr.length-1); 
            char temp = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] = temp; 
        }
        System.out.println(arr);

        // prints out the arrays 
        for (int i = 0; i < alphabet.length-1; i++) {
            System.out.print( "\n" + alphabet[i] + "|" + randAlpha[i] );
        }

    }

  }
      