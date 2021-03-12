package programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner sc=new Scanner(System.in);
		int n1=0;
		int n2=1;
		int n3;
		
		 int s = sc.nextInt();
		 System.out.print(n1+","+n2+",");
		 for (int i=1; i<10;i++) {
			 n3=n1+n2;
			 n1=n2;
			 n2=n3;
			 
			 System.out.print(n3+",");
			 
			
		}
		 
	}
	
	
} 
//0,1,1,2,3,5,8,13,21,34


