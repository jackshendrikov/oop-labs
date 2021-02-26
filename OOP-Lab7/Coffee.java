/**
 * This class describe data about object Coffee.
 *
 */

public class Coffee{
 
    private String name;
    private String pack;
    private String con;
    private float weight;
    private int price;

    Coffee(String name, String con, String pack, float weight, int price){
    	this.name = name;
    	this.con = con;
    	this.pack = pack;
    	this.weight = weight;
    	this.price = price;
    }

    @Override 
    public boolean equals(Object obj) {
    	return obj instanceof Coffee && ((Coffee) obj).name == name;
    } 
 
    public float getWeight(){
    	return weight;     
    } 
    String getCon(){
    	return con;     
    }

    @Override 
    public String toString(){
        return String.format("%-33s%-3s%-18s%-3s%-18s%-3s%-18s%-3s", name + " [" + con + "]", "|", "Packaging: " + pack,
                "|", "Weight: " + weight + "gr", "|", "Price: " + price + "₴", "|");
    }
} 