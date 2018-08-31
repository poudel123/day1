package assignment1;

import java.util.Scanner;

public class Interst {
      private static Scanner sc;

	public static void main(String args[])
      {
    	  double pr, rate, t, sim,com;
		
		sc = new Scanner(System.in);
    	  System.out.println("enter the Amount:");
    	  pr=sc.nextDouble();
    	  System.out.println("Enter the number of events:");
    	  t=sc.nextDouble();
    	  System.out.println("enter the rate of interst");
    	  rate=sc.nextDouble();
    	  sim=(pr*t*rate)/100;
    	 com = pr*Math.pow(1.0+rate/100.0,t) -pr;
    	  System.out.println("Simple Interst: "+sim);
    	  System.out.println("Compound Interst: "+com);
    	  }
}

