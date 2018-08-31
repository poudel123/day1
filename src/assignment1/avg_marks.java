
package assignment1;

import java.util.Scanner;

public class avg_marks {
	private static Scanner sc;

	public static void main(String args[]) {
		int num[][] = new int[3][3];
		int sum1=0,avg1=0,sum2=0,avg2=0,sum3=0,avg3=0;
		int sum1_A=0,avg1_A=0,sum2_B=0,avg2_B=0,sum3_C=0,avg3_C=0;
		sc = new Scanner(System.in);
				System.out.println("Enter values: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				num[i][j]=sc.nextInt();
			}
		}
		for(int j=0;j<3;j++)
		{
			sum1=sum1+num[0][j];
			sum2=sum2+num[1][j];
			sum3=sum3+num[2][j];
			avg1=sum1/3;
			avg2=sum2/3;
			avg3=sum3/3;
			
		}
		System.out.println("Score of student1 is :"+sum1);
		System.out.println("Average of student1 is :"+avg1);
		System.out.println("Score of student2 is :"+sum2);
		System.out.println("Average of student2 is :"+avg2);
		System.out.println("Score of student3 is :"+sum3);
		System.out.println("Average of student3 is :"+avg3);
		for(int i=0;i<3;i++)
		{
			sum1_A=sum1_A+num[i][0];
			sum2_B = sum2_B+num[i][1];
			sum3_C=sum3_C+num[i][2];
			avg1_A=sum1_A/3;
			avg2_B=sum2_B/3;
			avg3_C=sum3_C/3;
		}
		System.out.println("Score of subjectA is:"+sum1_A);
		System.out.println("Average of subjectA is:"+avg1_A);
		System.out.println("Score of subjectB is:"+sum2_B);
		System.out.println("Average of subjectB is:"+avg2_B);
		System.out.println("Score of subjectC is:"+sum3_C);
		System.out.println("Average of subjectC is:"+avg3_C);
	}
	
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			





















































			
			
			
	
