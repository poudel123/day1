package assignment1;

import java.util.Scanner;

public class Missing {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
				int total;
		System.out.println("Enter how many numbers to write: ");
		int n = Integer.parseInt(in.nextLine());
		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		int x=array.length;
		total=((x+1)*(x+2))/2;
		for(int i = 0; i <x; i++) {
			total-=array[i];
		}
		System.out.println("missing number is "+total);
	}

}
