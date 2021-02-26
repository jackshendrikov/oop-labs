/** Class Word creates object and divides it into array of letters.
 * Class has setter and method of deleting all previous entries the
 * latest letter in word.
 *
 * @version 1.0 14 February 2019
 * @author Jack Shendrikov
 * @since 1.0
 */
public class Word {

    /**
     * @param letters array of letters
     * @param buf string of word
     */
    private Letter[] letters;
    private String buf;

    String getWord(){
        StringBuffer str = new StringBuffer();
        return str.toString();
    }
    /** Setter*/
    void setWord(StringBuffer sl){
        String s = sl.toString();
        if (!s.equals("")){
            String word = new String(sl);
            letters = new Letter[word.length()];
            buf = word;
            for (int i = 0; i < sl.length(); i++) {
                letters[i] = new Letter(sl.substring(i,i+1));
            }
        }
    }

    /** Method deletes previous entries the latest letter in word*/
    void removeChar(){
        if (buf!=null){
            char c = buf.charAt(buf.length()-1);
            StringBuffer str = new StringBuffer();
            for (int i = 0; i < buf.length(); i++) {
                if (buf.charAt(i)!=c){
                    str.append(buf.charAt(i));
                }
            }
            str.append(c);
            letters = new Letter[str.length()];
            for (int i = 0; i < str.length(); i++) {
                letters[i]=new Letter(str.substring(i,i+1));
            }
        }
    }

    public String toString(){
        String str = " ";
        for (Letter letter : letters) {
            str += letter.toString();
        }
        return str;
    }
}
