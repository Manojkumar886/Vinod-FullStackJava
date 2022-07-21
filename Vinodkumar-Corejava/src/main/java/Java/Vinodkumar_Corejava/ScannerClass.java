package Java.Vinodkumar_Corejava;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter your School Name");
	String name=scan.nextLine();
	System.out.println("what is your tenth mark");
	int mark=scan.nextInt();
	System.out.println("enter your tamil mark");
	int mark1=scan.nextInt();
	System.out.println("enter your 10th percentage");
	double  total=scan.nextDouble();
	System.out.println("enter your aadharname");
	String key=scan.nextLine();
//	System.out.println("enter your aadar card number");
//	long aadhar=scan.nextLong();
	
	
	System.out.println("School Name :"+name+ "10th total Mark: "+mark+" your tamil mark: "+mark1+" your percentage is"+total);
	
	

	}

}



//Typecasting -two type of typecasting using in java
//1.widening(change to variable)
//2.narrowing(convert a one data type to another data type...
//short,int,long,float,double,char,boolean,string
//
//1.int a=10;
//float b=a;
//
//
//Scanner class:
//java.util----
//
//scanner class is defined by get a value in run time..
//
//Scanner class created an Object
//types.......
//String--nextLine(),next()
//int-nextInt()
//double-nextDouble....
