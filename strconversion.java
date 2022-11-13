package firstt;

public class String_conversion {

	public static void main(String[] args) {
	int num =100;
	//converstion in various forms;
	System.out.println(Integer.toString(num));
	System.out.println(Integer.toBinaryString(num));
	System.out.println(Integer.toOctalString(num));
	System.out.println(Integer.toHexString(num));
	
String str1="100";
String str2="1100100";
String str3="144";
String str4="64";
System.out.println(Integer.parseInt(str1));
System.out.println(Integer.parseInt(str2,2 /*base address of binary*/));
System.out.println(Integer.parseInt(str3,16));
System.out.println(Integer.parseInt(str4,8));
}
}

