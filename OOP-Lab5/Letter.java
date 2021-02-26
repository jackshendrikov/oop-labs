/** Class Letter creates object of letter.
 * Class has getter, setter, constructor.
 *
 * @version 1.0 14 February 2019
 * @author Jack Shendrikov
 * @since 1.0
 */
public class Letter {

    /**
     * @param letter symbol of letter
     */
    private String letter;

    /** Constructor of class Letter*/
    Letter(String ltr){
        letter = ltr;
        System.out.print(letter);
    }

    public String toString(){
        return letter;
    }
}
