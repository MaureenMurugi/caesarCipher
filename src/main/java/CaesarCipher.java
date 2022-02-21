import java.io.IOException;
import java.util.Scanner;
import model.Encoding1;
import model.Decoding1;


public class CaesarCipher {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a phrase to encrypt");
//        String phrase = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String phrase = myScanner.nextLine();
        System.out.println("Please enter a cipher key(1-25)");
        int cKey = myScanner.nextInt();
    }

//Front-interface
    public CaesarCipher() {
    }



}
