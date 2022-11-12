package firstt;

public class Java1 {

	public static void main(String[] args) {
	
//string concatenation:
		//method 1:
 String str1="bimmi";
 String str2="simmi";
 String str3=str1+str2;
 System.out.println(str3);
 //method 2:
 String str4=str1.concat(str2);
 System.out.println(str4); 
 //addition of number and string
 int num=100;
 System.out.println(str3+num+"\n");
 
 //string length
 System.out.println(str3.length());
 //to remove spaces in begining and at end
 String str5="     hello bimmi     ";
 System.out.println(str5);
 System.out.println(str5.trim());
 //uppercase
 System.out.println(str3.toUpperCase());
 //lowercase:
 System.out.println(str3.toLowerCase());
 //to check wheather its empty
 System.out.println(str3.isEmpty());
 String str6="";
 System.out.println(str6.isEmpty());
	}

}

