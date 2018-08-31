package assignment1;

import java.util.Scanner;

public class Discount {
	
	private static Scanner ip;

	public static void main(String args[]) {
	int discount,newitem,price;
		ip = new Scanner(System.in);
		newitem= ip.nextInt();
		System.out.println("Enter the cost");
		discount=(35*newitem)/100;
		price=newitem-discount;
		System.out.println("The price after discount is: "+price);
		
	}
	

}
