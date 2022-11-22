package secondstep;

public class Java_method {

	public static void main(String[] args) {
		Java_method m1=new Java_method();
		m1.doThis();
       m1.addition(5, 7);
       int x=m1.multiply(6,5);
       System.out.println(x);
	}
	
	//method1 withOUT ARGUEMENT having scope open and close bracket
	public void doThis()
	{
		System.out.println("do this executed");
	}
	//METHOD 2 WITH ARGUEMENT
	public void addition(int n1,int n2)
	{
		System.out.println("addition of given is  "+(n1 +n2));
	}
   //method 3 with return
	public int multiply(int n3,int n4)
	{
		int num3=n3*n4;
		return num3;
	}
	//
}

