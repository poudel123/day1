package assignment1;

import java.util.Scanner;

public class squaretable {
	     private static Scanner sc;

		public static void main(String Args[])
	     {
	    	 sc = new Scanner(System.in);
	    	 int num;
	    	 System.out.println("enter an integer number: ");
	    	 num=sc.nextInt();
	    	 System.out.println("square: "+Math.pow(num,2));
	     }
	}