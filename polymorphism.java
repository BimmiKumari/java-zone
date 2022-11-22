package secondstep;

public class Method_overloading {
//method overloading allow us to create various method with sam emethod name but thier should be difference in term of no of variable and data type
	public  void addition(int m,int n) {
		 System.out.println(m+n);
		}
	public  void addition(double m,double n) {
		 System.out.println(m+n);
		}
	public  void addition(int m,int n,int f) {
		 System.out.println(m+n+f);
		}
	public  void addition(double m,int n) {
		 System.out.println(m+n);
		}
	public static void main(String args[])
	{
		Method_overloading M1=new Method_overloading();
		M1.addition(100000, 0);
		M1.addition(4, 5);
		M1.addition(6, 7, 9);
	}
	

}

