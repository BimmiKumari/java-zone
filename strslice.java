package firstt;

public class Strslice {

	public static void main(String[] args) {
		//char at
		String str1="ABCDEF";
		//System.out.println(str1.charAt(3));
		//write a program to reverse the string
		int i,j;
		String temp="";
		for(i=0;i<str1.length();i++)
		{
		temp=str1.charAt(i)+temp;
		}
		System.out.println(temp);
		
		//substring
		
		System.out.println(str1.substring(2,4));
		
		//split
		String str2="a_b_c_d";
		String str3="b";
		String [] arr=str2.split(str3);
		for(String x:arr)
		{
		System.out.println(x);
		}
		
	}

}

