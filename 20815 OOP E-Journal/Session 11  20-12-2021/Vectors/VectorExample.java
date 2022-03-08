package vectors;

import java.util.Vector;

public class VectorExample {

public static void main(String[] args) {

int size=5;

Vector <Integer> vect = new Vector <Integer> (size);

vect.add(5);
vect.add(-10);
vect.add(52);
vect.add(23);
vect.add(-12);
vect.add(34);
vect.add(-50);
vect.add(25);
vect.add(-72);
vect.add(33);
System.out.println(vect);

for(int i=0; i<vect.size();i++)
{
System.out.println(vect.get(i));
}
System.out.println();
vect.remove(3);
System.out.println(vect);

vect.set(2,89);
System.out.println(vect);

vect.set(1,56);
System.out.println(vect);

Vector vect1 = new Vector();

vect1.add(1);
vect1.add(2);
vect1.add("Goa");
vect1.add("Margao");

System.out.println(vect1);
}



}