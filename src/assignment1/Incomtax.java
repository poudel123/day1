package assignment1;

import java.util.Scanner;

public class Incomtax {
     private static Scanner sc;

	public static void main(String args[]) {
    	 int a,tax=0;
    	 sc = new Scanner(System.in);
    	 System.out.println("Enter your income");
    	 a = sc.nextInt();
    	 if(a >= 0 && a<= 180000)  {
    		 System.out.println("Your not under tax"); 
    	 }
    	 else if(a >= 181001 && a<= 300000) {
    		 tax = (a*10)/100;
    		 
    		 System.out.println("you have to pay: "+tax);
    	 }
    	 else if(a>= 300000 && a<+ 500000) {
    		 tax = (a*20)/100;
    		 System.out.println("you have to pay: "+tax);
    	 }
    		 else if(a>= 500001 && a<+ 1000000) {
        		 tax = (a*30)/100;
        		 System.out.println("you have to pay: "+tax);
    	 }
     }
}
