package OOPS_CONCEPT;

public class Static_keyword {

	 static String name="abc"; //shared among various object
	int age=8;
	String grade="1st";
	public void display()
	{
		System.out.println("student name is "+ name +" and age is"+age+" with grade"+grade);
	}
	/*public Static_keyword() {
		System.out.println("begining");
	}*/
	public Static_keyword(String name,int age,String grade) {
	   	this.name=name;
	   	this.age=age;
	   	this.grade=grade;
	}
	
	public static void main(String args[]) {
		Static_keyword s1=new Static_keyword("bimmi",20,"1st");
		Static_keyword s2=new Static_keyword("simmi",10,"2nd");
		s1.display();
		s2.display();
	}
	

}
