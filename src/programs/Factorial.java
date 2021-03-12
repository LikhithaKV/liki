package programs;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner sc=new Scanner(System.in);
		int n=1;
		 int s = sc.nextInt();
		 for (int i = s; i>0; i--) {
			n=n*i;
		}
		 System.out.println(n);
	}
	}
