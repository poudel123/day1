package assignment1;

import java.io.IOException;
import java.util.Scanner;

public class StringOfPal {
  private static Scanner input;

public static void main(String args[])throws IOException{
	  String a[]= new String[10], b="", p[]= new String[10];
	  int i,j,k=0;
	  input = new Scanner(System.in);
	  System.out.println("Enter String");
	  for(i=0;i<10;i++)
		  a[i]=input.nextLine();
	  //System.out.println(a[0]);
	  for(j=0;j<10;j++) 
	  { b="";
	  for(i= a[j].length()-1; i>=0;i--)
	  {
		  b= b + a[j].charAt(i);
	  }
	  if(a[j].equals(b)) {
		  p[k]=a[j];
		  k++;
	  }
	  }
	  System.out.println(k);
	  for(i=0;i<k-1;i++)
		  for(j=0;j<k-i-1;j++)
		  {
			  if(p[j].length()>p[j+1].length()) {
				  b=p[j];
				  p[j]=p[j+1];
				  p[j+1]=b;
			  }
		  }
	  for(i=k-1;i>=0;i--)
		  System.out.println(p[i]);
  }
}
 

