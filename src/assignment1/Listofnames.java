package assignment1;
import java.io.*;
import java.util.*;

public class Listofnames {
	private static Scanner ip;

	public static void main(String args[])throws IOException{
	BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
	ip = new Scanner(System.in);
			String name[]= new String[31],nam;
			System.out.println("Enter name");
			nam=ip.nextLine();
			System.out.println("Enter size of array");
			int size=ip.nextInt(),fl=0,i;
			System.out.println("Enter name array");
			for(i=0;i<size;i++)
			{
				name[i]=p.readLine();
				System.out.println("name at "+i+ " " + name[i]);
				if(name[i].equals(nam)) {
					fl++;
				}
			}
			System.out.println("Frequency= "+fl);
			
	

}
}
