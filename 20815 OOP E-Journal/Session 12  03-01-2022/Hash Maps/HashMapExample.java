import java.util.HashMap;
import java.util.Map;

public class HashMapExample {


	public static void main(String [] args){

		HashMap <Integer, String> myHash = new HashMap<>();

		
		myHash.put(128, "Aksah Vaidya");
		myHash.put(167, "Anand Gaurav");
		myHash.put(199, "Henrita Fernandes");
		myHash.put(201, "Makrand Dessai");
		myHash.put(188,"Akriti Naik");

		System.out.print(myHash);	
		System.out.println();	

		
		myHash.put(201, "Lynda Lyon");
		System.out.print(myHash);	
		System.out.println();	

		if (myHash.containsKey(199)) { 

			
			String name = myHash.get(199);
			
			System.out.println("value for key 199 is: " + name);
		}
		System.out.println();	

		myHash.remove(167);		
		System.out.print(myHash);	
		System.out.println();	
	
		// Iterate the map using for-each loop
		for (Map.Entry<Integer, String> emp : myHash.entrySet()){
			System.out.println("Key: " + emp.getKey() + " Value: " + emp.getValue());
		}
	}

}

