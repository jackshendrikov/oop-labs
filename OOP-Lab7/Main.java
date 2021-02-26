import java.util.Iterator;

/** Class Main realize the task of Lab7.
 *
 * Task: Create a class that describes a typed collection (collection type is a
 * generalized class from laboratory work №6), which implements a given interface (Set)
 * and has a given internal structure (Array with an initial number of elements 15
 * and an increase in the number of elements by 30%) .
 *
 * Implement all interface methods, as well as create at least 3 constructors
 * (1 - empty, 2 - in which 1 object of the generalized class is transferred,
 * 3 - in which the standard collection of objects is transferred).
 *
 * All initial data are set in the executive method.
 * The program contains 4 classes:
 *    - Coffee class (generalized class with laboratory №6);
 *    - Class MyCoffeeSet (implements Set <Coffee>);
 *    - Class Main (with executive method);
 *
 * In the execution method, we create Coffee objects that will be part of our collection.
 * Using the methods implemented in our collection, we add, remove, etc. from the created
 * set of elements.
 *
 * @version 1.0 18 February 2019
 * @author Jack Shendrikov
 * @since 1.0
 */

public class Main{
	public static void main(String[] args) {
		int count = 1;
		MyCoffeeSet set = new MyCoffeeSet();
		set.add(new Coffee("Lavazza","Ground","Jar",130f,250));
		set.add(new Coffee("Ferarra","Grain","Package",270f,1000));
		set.add(new Coffee("Jacobs","Instant","Jar",100f,95));
		set.add(new Coffee("Nescafe","Instant","Package",50f,120));
		set.add(new Coffee("Jockey","Ground","Package",60,250));
		set.add(new Coffee("Jardin","Grain","Package",250f,81));
		set.add(new Coffee("Ambassador","Grain","Package",1000f,270));
		set.add(new Coffee("Ristretto","Ground","Package",250f,105));
		set.add(new Coffee("Ambassador Blue Label","Instant","Jar",190f,190));
		set.add(new Coffee("TOTTI","Grain","Package",1000f,199));
		set.add(new Coffee("Ambassador Espresso","Ground","Package",225f,70));
		set.add(new Coffee("Manhattan","Grain","Package",250f,119));
		set.add(new Coffee("Trevi Espresso","Grain","Package",1000f,279));
		set.add(new Coffee("Brazilеro","Instant","Package",500f,198));
		set.add(new Coffee("Turati","Grain","Package",1000f,465));


		System.out.println("\n________________Initial collection________________\n");
		for (Coffee aSet : set) {
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(aSet);
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\nРозмір початкової колекції: " + set.size());


		//*****************************************ADD******************************************************************
		System.out.println("\n________________Add elements________________\n");
		set.add(new Coffee("Ristretto","Ground","Package",250f,105));
		set.add(new Coffee("FigaroCoffee","Ground","Jar",80f,300));
		set.add(new Coffee("Lofbergs","Grain","Package",1150f,100));
		set.add(new Coffee("Starbucks","Ground","Jar",11200f,2500));
		set.add(new Coffee("DunkinDonuts","Instant","Package",95f,100));

		Iterator<Coffee> iterator0 = set.iterator();
		count = 1;
		while (iterator0.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iterator0.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\nSize after adding items to the collection (some items again): " + set.size() + "\n");


		//*****************************************REMOVE***************************************************************
		System.out.println("________________Delete items________________\n"
		);
		System.out.println("Collection after deletion of \"Lavazza\":");
		set.remove(new Coffee("Lavazza","Ground","Jar",130f,250));

		Iterator<Coffee> iterator2 = set.iterator();
		count = 1;
		while (iterator2.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iterator2.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\nSize after removal \"Lavazza\": " + set.size() + "\n");


		//*****************************************isEmpty**************************************************************
		System.out.println("________________Check for an empty collection________________\n");
		System.out.println("The collection is empty: " + set.isEmpty());


		//*****************************************CONTAIN**************************************************************
		System.out.println("\n________________Checking for occurrence of an element________________\n");
		System.out.println("Element \"Nescafe\" in collection: " + set.contains(new Coffee("Nescafe","Instant",
				"Package",50f,120)));
		System.out.println("Element \"Lavazza\" in collection: " + set.contains(new Coffee("Lavazza","Ground",
				"Jar",130f,250)) + "\n");

		//*****************************************toArray**************************************************************
		System.out.println("________________Implementation of the 'toArray' method________________\n");
		Coffee[] arr = set.toArray();
		for (Coffee anArr : arr) {
			System.out.println(new String(new char[58]).replace("\0", "—"));
			System.out.printf("%-2s%-5s", "⎜", anArr);
		}
		System.out.println(new String(new char[58]).replace("\0", "—"));
		System.out.println("\nElement #8:");
		System.out.println(new String(new char[59]).replace("\0", "—"));
		System.out.printf("%-2s%-5s", "⎜", arr[7]);
		System.out.println(new String(new char[58]).replace("\0", "—"));


		//*****************************************containsAll**********************************************************
		System.out.println("\n_______________Implementing the 'containsAll' method________________\n");

		MyCoffeeSet set1 = new MyCoffeeSet();
		set1.add(new Coffee("Paradise","Ground","Package",125f,70));
		set1.add(new Coffee("Elite Health Line","Instant","Package",190f,28));
		System.out.println("Elements for method \"containsAll\":\n");
		Iterator<Coffee> iteratora = set1.iterator();
		System.out.println("--------------------------------1--------------------------------\n");
		count = 1;
		while (iteratora.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iteratora.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\tEntry: " + set.containsAll(set1) + "\n");
		System.out.println("--------------------------------2--------------------------------");

		MyCoffeeSet set2 = new MyCoffeeSet();
		set2.add(new Coffee("Jacobs","Instant","Jar",100f,95));
		set2.add(new Coffee("Nescafe","Instant","Package",50f,120));
		set2.add(new Coffee("Jockey","Ground","Package",60,250));
		Iterator<Coffee> iteratorb = set2.iterator();
		System.out.println();
		count = 1;
		while (iteratorb.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iteratorb.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\tEntry: " + set.containsAll(set2));
		System.out.println("\n--------------------------------3--------------------------------");

		MyCoffeeSet set3 = new MyCoffeeSet();
		set3.add(new Coffee("Jacobs","Instant","Jar",100f,95));
		set3.add(new Coffee("Nescafe","Instant","Package",50f,120));
		set3.add(new Coffee("Jockey","Ground","Package",60,250));
		Iterator<Coffee> iteratorc = set3.iterator();
		System.out.println();
		count = 1;
		while (iteratorc.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iteratorc.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\tEntry: " + set.containsAll(set2));
		System.out.println();


		//*****************************************addAll***************************************************************
		System.out.println("________________Implementation of the 'addAll' method________________\n");
		MyCoffeeSet set4 = new MyCoffeeSet();
		set4.add(new Coffee("Paradise","Ground","Package",125f,70));
		set4.add(new Coffee("Elite Health Line","Instant","Package",190f,28));
			System.out.println("Collection for adding items:");
		Iterator<Coffee> iterator4 = set4.iterator();
		count = 1;
		while (iterator4.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iterator4.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\nThe collection has changed: " + set.addAll(set4));
		System.out.println("\nCollection after adding: ");
		Iterator<Coffee> iterator10 = set.iterator();
		count = 1;
		while (iterator10.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iterator10.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\nРозмір колекції: " + set.size() + "\n");

		//*****************************************removeAll************************************************************
		System.out.println("________________Implementation of the 'removeAll' method________________\n");
		MyCoffeeSet rem = new MyCoffeeSet();
		rem.add(new Coffee("Nescafe","Instant","Package",50f,120));
		rem.add(new Coffee("Jockey","Ground","Package",60,250));

		System.out.println("Collection before deletion:");
		Iterator<Coffee> iterator12 = set.iterator();
		count = 1;
		while (iterator12.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iterator12.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));

		System.out.println("\nCollection to delete:");
		Iterator<Coffee> iteratorf = rem.iterator();
		count = 1;
		while (iteratorf.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iteratorf.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));

		System.out.println("\nCollection after deletion:");
		set.removeAll(rem);
		Iterator<Coffee> iterator11 = set.iterator();
		count = 1;
		while (iterator11.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iterator11.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));

		System.out.println("\nThe collection has changed: " + set.removeAll(rem) + "\n");


		//*****************************************retainAll***********************************************************
		System.out.println("________________Implementation of the 'retainAll' method________________\n");
		MyCoffeeSet set5 = new MyCoffeeSet();
		set5.add(new Coffee("Paradise","Ground","Package",125f,70));
		set5.add(new Coffee("Elite Health Line","Instant","Package",190f,28));

		System.out.println("Collection before deletion:");
		Iterator<Coffee> iterator50 = set.iterator();
		count = 1;
		while (iterator50.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iterator50.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));

		System.out.println("\nCollection to delete:");
		Iterator<Coffee> iterator5 = set5.iterator();
		count = 1;
		while (iterator5.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iterator5.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));

		System.out.println("\nCollection after deletion:");
		Iterator<Coffee> iterator6 = set.iterator();
		set.retainAll(set5);
		count = 1;
		while (iterator6.hasNext()){
			Coffee coffee = iterator6.next();
			if (coffee!= null) {
				System.out.println(new String(new char[31]).replace("\0", "——"));
				System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
				System.out.println(coffee);
				count++;
			}
			else break;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));
		System.out.println("\nThe collection has changed: " + set.retainAll(set5) + "\n");


		//*****************************************CLEAR****************************************************************
		System.out.println("________________Clean the collection________________\n");
		set.clear();
		System.out.println("Collection size after cleaning: " + set.size());

		//************************************CONSTRUCTORS**************************************************************
		System.out.println("_________________________________________________\n");
		MyCoffeeSet seta = new MyCoffeeSet(new
				Coffee("CostaCoffee","Package","Instant",40f,15));
		seta.add(new Coffee("DunkinDonuts","Jar","Ground",1000f,500));


		System.out.println("\tConstructor #2");
		Iterator<Coffee> iteratorr = seta.iterator();
		count = 1;
		while (iteratorr.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iteratorr.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));


		System.out.println("\n\tConstructor  #3");
		MyCoffeeSet setff = new MyCoffeeSet();
		setff.add(new Coffee("Ferarra","Grain","Package",270f,1000));
		setff.add(new Coffee("Jacobs","Instant","Jar",100f,95));
		setff.add(new Coffee("Nescafe","Instant","Package",50f,120));
		MyCoffeeSet set8 = new MyCoffeeSet(setff);
		Iterator<Coffee> iteratort = set8.iterator();
		count = 1;
		while (iteratort.hasNext()){
			System.out.println(new String(new char[31]).replace("\0", "——"));
			System.out.printf("%-2s%-3s%-3s", "⎜", count, "⎜");
			System.out.println(iteratort.next());
			count++;
		}
		System.out.println(new String(new char[31]).replace("\0", "——"));

		System.out.println("_________________________________________________");
	}
}