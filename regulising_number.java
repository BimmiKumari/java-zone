package regex;

public class Regulising_number_range {

	public static void main(String[] args) {
		/*
		 * Create a RegEx pattern to represent following number ranges
		 * 1. 0-99
		 * 2. 0-1000
		 * 3. 99-9999
		 * 4. 25-75
		 * 5. 220-240
		 */
		//String patt="[0-9][0-9]?";
		// String patt="[0-9][0-9]?[0-9]?|1000";
		// String patt="99|[1-9][0-9][0-9][0-9]?";
		// String patt="2[5-9]|[3-6][0-9]|7[0-5]";
		 String patt="2[2-3][0-9]|240";
	    String str1="238";
	   
	    System.out.println(str1.matches(patt));
	    
	}
	

}
