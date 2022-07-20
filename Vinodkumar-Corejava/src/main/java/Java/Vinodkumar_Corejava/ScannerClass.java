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
	System.out.println("enter your aadar card number");
	long aadhar=scan.nextLong();
	
	System.out.println("School Name :"+name+ "10th total Mark: "+mark+" your tamil mark: "+mark1+" your percentage is"+total);
	
	

	}

}
