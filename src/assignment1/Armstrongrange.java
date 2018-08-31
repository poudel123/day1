package assignment1;

public class Armstrongrange {
      public static void main(String args[])
      {
    	  for(int n=100;n<1000;n++)
    	  {
    		  int a=n;
    		  int d=0;
    		  int s=0;
    		  
    		  while(a>0) 
    		  {
    			  d=a % 10;
    			  s=s+ (d*d*d);
    			  a=a/10;
    		  }
    		  if(n==s)
    		  {
    			  System.out.println(n+"is a armstrong number");
    		  }
    	  }
      }
}