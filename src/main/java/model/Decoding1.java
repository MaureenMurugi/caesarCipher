package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Decoding1 {
    private String encodedText;
    private int cKey;
    private final Character [] alphabets = {'A','B','C','D','E','F','G'
            ,'H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X',
            'Y','Z'};
    private final List<Character> listItems = Arrays.asList(alphabets);


    public Decoding1(String encodedText, int cKey) {
        this.encodedText = encodedText;
        this.cKey = cKey;
    }
    public String getEncodedText() {
        return this.encodedText;
    }
    public int getcKey(){
        return this.cKey;
    }
    public void setEncodedText(String encodedText){
        this.encodedText = encodedText;
    }
    public void setcKey(int cKey) {
        this.cKey = cKey;
    }
    public String decodeEncodedText() {
       char [] words = this.getEncodedText().toUpperCase().toCharArray();
        List<Character> reconstructed= new ArrayList<>();
        for (char word: words) {
            if (word == ' '){
                reconstructed.add(' ');
            }
            for (char letter: listItems){
                if (letter == word){

                  int newIndex = (Math.abs(listItems.indexOf(letter) +(26-this.getcKey()) )%26);
                  reconstructed.add(alphabets [newIndex]);

                }
            }

        }
     return reconstructed.stream().map(Object::toString).collect(Collectors.joining());
    }
}
