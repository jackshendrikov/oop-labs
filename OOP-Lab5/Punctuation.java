/** Class Punctuation creates object of punctuation symbol.
 *
 * @version 1.0 14 February 2019
 * @author Jack Shendrikov
 * @since 1.0
 */
class Punctuation {

    /**
     * @param punct
     * symbol of punctuation
     */
    private StringBuffer punct=null;

    /**Constructor of symbol of punctuation */
    Punctuation(StringBuffer b){
        if (b!=null){
            this.setPunct(b);
            System.out.print(b + " ");
        }
    }

    StringBuffer getPunct() {
        if (punct==null){
            return new StringBuffer();
        }else
            return punct;
    }

    private void setPunct(StringBuffer punct) {
        this.punct = punct;
    }
}

