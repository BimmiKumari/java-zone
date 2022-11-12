package firstt;

public class Stringcompare {

	public static void main(String[] args) {
	//equals 
      String str1="ABCDE";
      String str2="PQRST";
     String str3="ABCDE";
      System.out.println(str1.equals(str2));
      System.out.println(str1.equalsIgnoreCase(str2));
//compare to
      System.out.println(str1.compareTo(str2));
      System.out.println(str1.compareToIgnoreCase(str2));
      System.out.println(str1.compareTo(str3));
      //matches
      String patt="[A-Z]{1,8}";
      System.out.println(str1.matches(patt));
	}

}
