package firstt;

public class Searching {
	public static void main(String[] args) {
		//contains
	String str1="I LOVE JAVA AND LOVE CODING";
	String str2="JAVA";
	System.out.println(str1.toLowerCase().contains(str2.toUpperCase()));
	//startswith
	System.out.println(str1.startsWith("I"));
	//ENDSWITH
	System.out.println(str2.endsWith("A"));
	//index of
	System.out.println(str1.indexOf("LOVE"));
	//second occurence
	System.out.println(str1.indexOf("LOVE",3));
	//LAST INDEX OF
	System.out.println(str1.lastIndexOf("LOVE"));
	}
}

