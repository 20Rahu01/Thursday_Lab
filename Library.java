package Day14_29_12;

import java.util.Scanner;

public class Library {

	public static void main(String []args){
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
	    age =sc.nextInt();
	    String name;
	    Scanner userName=new Scanner(System.in);
	    System.out.println("Enter Name:");
	    name =userName.nextLine();
	    if(age<=15) {
	    	System.out.println(name+ " can borrow book from kid section ");
	    	System.out.println("you are not allowed to borrow book from adult section.");
	    	
	    }
	    if(age>15) {
	    	System.out.println("you are not allowed to borrow book from kid section.");
	    	System.out.println(name+ " can borrow book from adult section ");
	    	
	    }
	}
}
