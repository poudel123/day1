package assignment1;

import java.util.Scanner;

public class Subjectmarks {
	private static Scanner scr;

	public static void main(String args[]) {
		int eng,sci,bio;
		scr = new Scanner (System.in);
		System.out.println("enter the English marks");
		eng=scr.nextInt();
		System.out.println("enter the science marks");
		sci=scr.nextInt();
		System.out.println("enter the Biology marks");
		bio=scr.nextInt();
		if(eng>60 && sci>60 && bio>60) 
			System.out.println("Student is Passed");
			else if((eng>60 && sci>60)||(sci>60 && bio>60)||(bio>60 && eng>60))
				System.out.println("Student is Promoted");
			else
				System.out.println("Student is Failed");
			
		}
	}

