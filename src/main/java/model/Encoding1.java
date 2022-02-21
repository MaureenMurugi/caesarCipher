package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Encoding1 {
    //    Should be in private ACM
    private String pText;
    private int cKey;
    private final Character [] alphabets = {'A','B','C','D','E','F','G'
            ,'H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X',
            'Y','Z'};
    private final List<Character> listItems = Arrays.asList(alphabets);

    public Encoding1(String pText , int cKey) {
        this.pText = pText;
        this.cKey = cKey;
    }
    public String getPText(){
        return this.pText;
    }
    public int getcKey(){
        return this.cKey;
    }
    public void setpText(String pText) {
        this.pText = pText;
    }
    public void setcKey(int cKey){
        this.cKey = cKey;
    }
    public boolean isValidKey() {
        return (this.cKey >0 && this.cKey <=25);
    }

    public String encodePText(){
        char [] words = this.getPText().toUpperCase().toCharArray();
        List<Character> reconstructed = new ArrayList<>();
        for(char word: words){
           if(word == ' '){
               reconstructed.add(' ');
           }
            for(char letter: listItems){
                if(letter == word){
                    int newIndex  = (listItems.indexOf(letter)+this.cKey)%alphabets.length;
                   reconstructed.add(alphabets [newIndex]);
                }else{

                }
            }

        }
        return reconstructed.stream().map(Object::toString).collect(Collectors.joining());
    }
}
