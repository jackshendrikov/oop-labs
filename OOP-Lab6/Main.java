import java.util.Arrays;

/** Class Main realize the task of Lab6.
 *
 * Task: Load a van of a certain volume with a certain amount of different types
 * of coffee that may be in different physical states (grain, ground, soluble in jars and bags).
 * Take into account the amount of coffee together with the package.
 *
 * To sort goods on the basis of a ratio of the price and weight.
 * Find the product in the van that corresponds to the specified range of coffee quality.
 *
 * @version 1.0 16 February 2019
 * @author Jack Shendrikov
 * @since 1.0
 */


public class Main {

    private static double func(double d) {
        d=d*100;
        int i = (int)Math.round(d);
        d=(double)i/100;
        return d;
    }

    public static void main(String[] args) {

        Coffee[] array = new Coffee[] {
                new Starbucks("Ground","Jar",11200,2500),
                new CostaCoffee("Grain","Package",270,1000),
                new DunkinDonuts("Instant","Jar",100,95),
                new Nescafe("Instant","Package",50,120),
                new FigaroCoffee("Grain", "Jar", 300, 80),
                new Lofbergs("Ground", "Package", 100, 1150),
                new Lavazza("Ground","Package",60,250)
        };
        int sum=0;
        System.out.print("The total weight of all brands of coffee - ");
        for (Coffee anArray : array) {
            sum = sum + anArray.GetWeight();
        }
        System.out.println(sum+" gram");

        double[] quality = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            quality[i] = array[i].GetPrice()/array[i].GetWeight();
        }

        Arrays.sort(quality);

        System.out.println(new String(new char[40]).replace("\0", "—"));
        System.out.printf("%-17s%-50s%-1s\n", "⎜", "Quality (price to weight ratio)","⎜");
        System.out.println(new String(new char[40]).replace("\0", "—"));
        System.out.printf("%-3s%-3s%-4s%-16s%-4s%-12s%-5s%-11s%-2s%-9s%s\n", "⎜", "#","⎜","Name of coffee","⎜", "Condition","⎜", "Packed","⎜", "Quality","⎜");
        System.out.println(new String(new char[40]).replace("\0", "—"));
        for (int i=quality.length-1;i>=0;i--) {
            for (Coffee anArray : array) {
                if (quality[i] == anArray.GetPrice() / anArray.GetWeight()) {
                    System.out.print("⎜  "+(quality.length - i) + "  ");
                    anArray.GetPackCon();
                    System.out.println(func(quality[i]) + "   ⎜");
                }
            }
            System.out.println(new String(new char[40]).replace("\0", "—"));
        }


    }
}

