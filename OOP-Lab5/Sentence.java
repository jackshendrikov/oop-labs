/** Class Sentence creates object and divides it
 * into array of words and punctuations.
 * Class has setters and constructor.
 *
 * @version 1.0 14 February 2019
 * @author Jack Shendrikov
 * @since 1.0
 */

public class Sentence {

    /**
     * @param words array of words
     * @param punctuations array of punctuations
     * @param numberWord quantity of words
     * @param numberPunct quantity of punctuations
     */

    private Word[] words;
    private Punctuation[] punctuations;
    private int numberWord = 0;
    private int numberPunct = 0;

    /**Constructor of Sentence*/
    Sentence(){
        words = new Word[30];
        punctuations = new Punctuation[30];
    }

    /**Setter for Sentence*/
    void setSentence(StringBuffer so){
        String s = so.toString();
        String [] strings = s.split(" ");
        char g;
        char[] c;

        for (String word : strings) {
            g = word.charAt(word.length()-1);
            if ((g=='?')||(g=='!')||(g=='.')||(g==',')||(g=='-')||(g==':')){
                if (word.length()>3&&( word.charAt(word.length()-2)=='.'&&word.charAt(word.length()-3)=='.')){
                    setWord(word.substring(0,word.length()-3));
                    setPunct(new StringBuffer (s.substring(s.length()-3,s.length())));
                }
                else{
                    c = new char [1];
                    c[0]=g;
                    setWord(word.substring(0, word.length()-1).trim());
                    setPunct(new StringBuffer(new String(c)));
                }
            }
            else{
                setWord(word.trim());
                setPunct(null);
                System.out.print(" ");
            }
        }
    }

    /**Setter for Punctuation*/
    private void setPunct(StringBuffer s){
        punctuations[numberPunct++] = new Punctuation(s);
//        numberPunct++;
    }

    /**Setter for Word*/
    private void setWord(String str){
        StringBuffer sl = new StringBuffer(str);
        words [numberWord] = new Word();
        words [numberWord].setWord(sl);
        numberWord++;
    }

    /**Method deletes previous entries the latest letter in word*/
    void removeChar(){
        for (int i = 0; i < words.length; i++) {
            if (punctuations[i]!=null & words[i]!=null ){
                if (i!=0)
                    System.out.print(" ");
                words[i].removeChar();
            }
        }
    }

    public String toString(){
        String result = "";

        for (int i = 0; i < numberWord; i++)
            if(i<numberWord-1)
                result += words[i].getWord()+" ";
            else
                result += words[i].getWord();
        return result;
    }
}


