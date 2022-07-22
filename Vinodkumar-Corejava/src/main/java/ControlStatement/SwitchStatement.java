package ControlStatement;

import java.util.Scanner;

//switch(){
//case 1: 
//	statement;
//	break;
//case 2:
//	statement;l
//	break;
//	default:statment
//	}
public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 System.out.println("p[lese enter your any one digit number");
		 int num=scan.nextInt();
		 switch(num)
		 {
		 case 0:
			 System.out.println("Number is zero");
			 break;
		 case 1:
			 System.out.println("Number is One");
			 break;
		 case 2:
			 System.out.println("Number is Two");
			 default :System.out.println("Nothing to search a number: "+num);
		 }

	}

}
