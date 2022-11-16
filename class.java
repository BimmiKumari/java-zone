package firstt;
import java.util.Scanner;
public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
       System.out.println("enter your phone number");
       Scanner bimmi=new Scanner(System.in);
       long number=bimmi.nextLong();
       if(number>0)
       {
    	 System.out.println("we will contact you soon"); 
       }
       else
    	   System.out.println("invalid number entered");
		}
		
	}

}

