import java.util.Scanner;
import java.util.TreeMap;
public class DrinkTypePgm8 {

	    public static void main(String[] args) {

	        // Create TreeMap and add three entries to it.
	        TreeMap<String, Integer> tree = new TreeMap<>();
	        
	        tree.put("COKE", 0);
	        tree.put("PEPSI", 9);
	        tree.put("SPRITE", 10);
System.out.println(tree);

         	
	        // Look up a value from a key in the TreeMap.
try {
	System.out.println("Enter the Drinktype");
	Scanner in=new Scanner(System.in);
	String Drinktype=in.nextLine();
	Drinktype=Drinktype.toUpperCase();
	//String Drinktype="Coke";
	int value = tree.get(Drinktype);
	if (value>0)
	{
	value=tree.get(Drinktype)-1;
	}
	else if(value<=0)
	{
	System.out.println(Drinktype + "Not Available");	
	}
	System.out.println(value);
	tree.put(Drinktype, value);
	System.out.println(tree);
		               
	        
}
catch(Exception e) {
	System.out.println(" Please Enter valid drink type");
}

	    }
	}

