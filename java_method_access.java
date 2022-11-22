package secondstep;

public class Employe_main {
 public static void main(String args[])
 {
	 Employe emp1=new Employe(); //object 1
	 emp1.empname="bimmi";
	 emp1.empsalary=90000;
	 emp1.empid=16;
	 emp1.displayBonus();
	 Employe emp2=new Employe();
	 emp2.empname="simmi";
	 emp2.empsalary=90000;
	 emp2.empid=117;
	 emp2.displayBonus();
	 
	 //method from java_method class
	 Java_method m1=new Java_method();
	 m1.doThis();
 }
}

