package ControlStatement;

import java.util.Scanner;

public class DemoAllControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Dell Enterprises");
		System.out.println("Tell us what is purpose of usage laptops\n IT<ACCOUNTS<GAMES<GENRAlUSE");
		String usage=scan.next();
		switch(usage)
		{
		case "IT":
			System.out.println("Your are asked it professional laptop. currently available");
			System.out.println("Tell us which amount of laptops you need");
			int price=scan.nextInt();
			if(price>15000&&price<50000)
			{
				System.out.println(price+" this price of laptops are lenovo,acer,hp,asus,dell");
				String brand=scan.next();
				switch(brand)
				{
				case "lenovo":
					System.out.println(brand+"specifications are 4GB ram,I3 processor,Many colours are avilable");
					break;
				case "dell":
					System.out.println(brand+"specifications are 4GB ram,I3 processor,Many colours are avilable");
					break;
					default:System.out.println("is not available");
				}
			}else
			{
				System.out.println(price+"This price of laptops model is soni,apple");
			}
			break;
		case "ACCOUNTS":
			System.out.println("Your are asked Accounts details.surrently is not avaiable");
			break;
		case "GAMES":
				System.out.println("your are asked playing a games laptop.its available many type of processor");
		break;
		case "GENRALUSE":
			System.out.println("Your asked general purpose laptops.That model laptop is Mostly recommanded in our enterprises");
		break;
		default: System.out.println("you are asked  "+usage+" laptops is not available");
		}
			System.out.println("Thank You for coming");
	}
	

}
