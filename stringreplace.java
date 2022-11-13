package firstt;

public class String_replace {

	public static void main(String[] args) {
		//replace
		String str1="CONCENTRAT1234ION 1234PAYS 1234A LOT";
		String str2="123";
		String str3="bimmi";
		System.out.println(str1.replace(str2, str3));
//replace all
		String str4="hello everyone 1234$&**";
		String patt="[^A-Za-z0-9\\s]";
		System.out.println(str4.replaceAll(patt, ""/*this is empty so its will remove all the speacial symbol*/));
	}

}

