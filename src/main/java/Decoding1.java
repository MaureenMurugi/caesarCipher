import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Decoding1 {
    private String encodedText;
    private int cKey;
    private final Character [] alphabets = {'A','B','C','D','E','F','G'
            ,'H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X',
            'Y','Z'};
    private final List<Character> listItems = Arrays.asList();


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
        String words[] = this.getEncodedText().split(" ");
        List<String> reconstructed= new ArrayList<>();
        for (String word: words) {
            List<String>randomWord = new ArrayList<>();
            char [] letters = word.toUpperCase().toCharArray();
            for (char letter: letters){
                if (listItems.contains(letter)){
                    int resultIndex = (listItems.indexOf(letter)-this.cKey) < 0
                            ? (listItems.indexOf(letter)-this.cKey)+alphabets.length:
                            (listItems.indexOf(letter)-this.cKey);
                    int newIndex = (resultIndex)%alphabets.length;
                    randomWord.add(String.valueOf(alphabets[newIndex]));
                }else {
                    randomWord.add(String.valueOf(letter));
                }
            }
            reconstructed.add(String.join("",randomWord));
        }
     return String.join(" ",reconstructed);
    }
}
