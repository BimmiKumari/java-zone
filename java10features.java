package Whats_new;

public class Garbage_collecter$ {
 public static void main(String args[])
 {
	 String a="Learning java";
	 for (int i=0;i<a.length();i++)
	 {
		 String temp= "ch"+i+"at"+a.charAt(i);
		 System.out.println(temp);
	 }
	// garbage means object which is not in use
 }
}
