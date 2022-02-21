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
        Encoding1 encoding1 = new Encoding1(phrase,cKey);
        if(encoding1.isValidKey()){
            Decoding1 decoding1 = new Decoding1(encoding1.encodePText(),cKey);
            System.out.println("Input String: "+encoding1.encodePText());
            System.out.println("Encrypted String: "+decoding1.decodeEncodedText());
        }else {
            System.out.println("Error");
        }
    }





}
