
public class StringManipulation {

	
	public static void main(String[] args) {
		
		String fName= " ABRA-CA-DABRA ";
		System.out.println(fName);
		System.out.println(fName.toLowerCase());
		System.out.println(fName.charAt(5));
		System.out.println(fName.compareTo("ABRA-ca-DABRA"));
		System.out.println(fName.compareToIgnoreCase("ABRA-ca-DABRA"));
		System.out.println(fName.concat(" GILLI-GILLI-HOO"));
		System.out.println(fName.trim());
		System.out.println(fName.length());
		System.out.println(fName.indexOf('A'));
	}

}
