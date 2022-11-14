package firstt;

import OOPS_CONCEPT.Access_specifier;
import secondstep.Java_method;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Char c1=new Char();   //object c1
       c1.color="red";
       c1.make="bwm";
       c1.display();
       Char c2 = new Char();
       c2.color="black";
       c2.type="bike";
       c2.display();
       
       //method from package secondstep
       Java_method m1=new Java_method();
  	   m1.doThis();
  	
	}

}

