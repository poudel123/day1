package assignment1;

import java.util.Scanner;

public class Date {
	 public static void main(String args[])  {
		 int i;
		 String date,temp="";
		 Scanner v=new Scanner(System.in);
		 System.out.println("Enter date in (dd,mm,yyyy) format.");
		 date = v.nextLine();
		 v.close();
		 int x = date.length();
		 for(i=0;i<x;i++)
		 {
			 char ch= date.charAt(i);
			 if(ch == ',')
				 temp=temp+'/';
			 else
				 temp=temp+ch;
		 }
		 String n=""+temp.charAt(3)+temp.charAt(4);
		 int mo= Integer.parseInt(n);
		 String m="";
		 switch(mo)
		 {
		 case 1:
			 m="jan";break;
		 case 2:
			 m="feb";break;
		 case 3:
			 m="mar";break;
		 case 4:
			 m="apr";break;
		 case 5:
			 m="may";break;
		 case 6:
			 m="jun";break;
		 case 7:
			 m="jul";break;
		 case 8:
			 m="aug";break;
		 case 9:
			 m="sep";break;
		 case 10:
			 m="oct";break;
		 case 11:
			 m="nov";break;
		 case 12:
			 m="dec";break;
	default:
		System.out.println("Enter a valid month");
		 }
		 System.out.println(temp.substring(0, 3)+ m +temp.substring(5));
	 }
}
