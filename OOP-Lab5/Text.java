/** Class Text creates object and divides it into array of sentences.
 * Class has setter, constructor and method, which delete extra spaces.
 *
 * @version 1.0 14 February 2019
 * @author Jack Shendrikov
 * @since 1.0
 */

class Text {
    /**
     * @param sentences array of sentences
     * @param numberSentence quantity of sentences
     * @param pos position of element
     */

    private Sentence[] sentences;
    private int numberSentence = 0;
    private int pos;

    /** Constructor of Text*/
    Text() {
        sentences = new Sentence[30];
    }

    /** Setter*/
    void setText(StringBuffer t) {
        StringBuffer updateStr = deleteTab(t);
        for (int i = pos; i < updateStr.length(); i++) {
            char symb = updateStr.charAt(i);
            if ((symb == '!') | (symb == '?') | (symb == '.')) {
                if (i + 3 < updateStr.length() && updateStr.charAt(i + 1) == '.'
                        && updateStr.charAt(i + 2) == '.') {
                    String sub = updateStr.substring(pos, i + 3);
                    StringBuffer temp = new StringBuffer(sub);
                    sentences[numberSentence] = new Sentence();
                    sentences[numberSentence].setSentence(temp);
                    numberSentence++;
                    i = i + 3;
                    pos = i;
                }
                else {
                    String sub = updateStr.substring(pos, i+1);
                    sub = sub.trim();
                    StringBuffer temp = new StringBuffer(sub);
                    sentences[numberSentence] = new Sentence();
                    sentences[numberSentence].setSentence(temp);
                    numberSentence++;
                    pos = i + 1;
                }
            }
        }
    }

    /** Method deletes previous entries the latest letter in word*/
    void removeSymbols(){
        for (int i = 0; i < numberSentence; i++) {
            sentences[i].removeChar();
            System.out.print(" ");
        }
    }
    /** Delete extra spaces*/
    private StringBuffer deleteTab(StringBuffer str) {
        return new StringBuffer(str.toString().trim().replaceAll(" +", " "));
    }
}
