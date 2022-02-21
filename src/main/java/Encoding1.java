import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Encoding1 {
    //    Should be in private ACM
    private String pText;
    private int cKey;
    private final Character [] alphabets = {'A','B','C','D','E','F','G'
            ,'H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X',
            'Y','Z'};
    private final List<Character> listItems = Arrays.asList();

    public Encoding1(String pText , int cKey) {
        this.pText = pText;
        this.cKey = cKey;
    }
    public String getPText(){
        return this.pText;
    }

    public String encodePText(){
        String words[] = this.getPText().split(" ");
        List<String> reconstructed = new ArrayList<>();
        for (String word: words){
            List<String> randomWord = new ArrayList<>();
            char [] letters = word.toUpperCase().toCharArray();

            }
        }
        return null;
    }
}
