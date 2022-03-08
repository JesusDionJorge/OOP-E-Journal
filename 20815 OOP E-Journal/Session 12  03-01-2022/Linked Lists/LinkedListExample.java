
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String [] args){
		
		LinkedList <Integer> myList = new LinkedList<Integer>(); 
				
		boolean status= myList.isEmpty(); // it will return true as list is empty
		System.out.println(status);
		
		
		myList.add(-123);
		myList.add(624);
		myList.add(90);
		myList.add(23);
		
		int length= myList.size();
		System.out.println(length);
		
		System.out.print(myList);
		System.out.println();
		
		myList.add(2, 901);
		System.out.print(myList); 
		System.out.println();
		
		myList.addFirst(789);
		myList.addLast(675);
		System.out.print(myList); 
		
		
		
		myList.remove();	
		System.out.println();
		System.out.print(myList);
		
		myList.removeFirst();	
		myList.removeLast();	
		System.out.println();
		System.out.print(myList);
		
		myList.remove(2);	
		System.out.println();
		System.out.print(myList);
		
		
		myList.set(1, 899);
		System.out.println();
		System.out.print(myList);
		System.out.println();
	
		
		for(Integer count: myList){
			System.out.print(" " + count);
		}
		System.out.println();
		
		
		for(int i=0; i<myList.size(); i++){
			System.out.print(" " + myList.get(i));
		}
	

	}

}
