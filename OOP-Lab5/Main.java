/** Class Main realize the task of Lab5.
 * The task consists in editing of text: deleting all previous entries
 * the latest letter in word of these word in all words of these text.
 *
 * @version 1.0 14 February 2019
 * @author Jack Shendrikov
 * @since 1.0
 */

public class Main {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("Lmormem impsmum         rdrolor tstit tatmet, tat melmecmtram ceonevenire lmlel... tUt mmmmenim ad minim vmemnmiam. ");
        System.out.println("Original Text:\n" + str);

        Text text = new Text();
        System.out.println("\nIntermediate Text: ");
        text.setText(str);

        System.out.println("\n\nResult Text: ");
        text.removeSymbols();
    }
}

