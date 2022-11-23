public class String_builder {
public static void main(String args[]) {
	String str1="I";
	str1=str1+" like ";
	str1=str1+"java";
	System.out.println(str1);
	//it created 5 strings i.e i //like//i like//java//i like java
	StringBuilder str2=new StringBuilder();
	str2.append("i");
	str2.append(" like ");
	str2.append("java");
	System.out.println(str2);
	//using StringBluider class we can reduce 5 occurence it can occur in three step only
   //use of further command
	str2.insert(11, " i love to learn java");
	System.out.println(str2);
	//to replace string by new string
	str2.replace(6,7," everything in ");
	System.out.println(str2);
	//to delete a character
	str2.deleteCharAt(0);
	System.out.println(str2);
	//to delete in between given index
	str2.delete(2, 10);
	System.out.println(str2);
	//to reverse string we have str2.reverse
	str2.reverse();
	System.out.println(str2);
	
	//string reverse withour str3.reverse() function
	String str3="abcde";
	String temp ="";
	for(int i=0;i<str3.length();i++) {
		temp =str3.charAt(i)+temp;
	}
	System.out.println(temp);
	
	
	
	
}
}

