package programs;

import java.util.Scanner;

public class ReverseAlternateWordsInString {

	

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		String[] a = s.split(" ");
		//String q = null;
		//String r = null;
		
		
		for (int i = 0; i < a.length; i++) {
			if(i%2==0) {
			String z = a[i];
			int n = z.length();
			for (int j=n-1; j>=0; j--) {
				System.out.print(z.charAt(j));
			}
			
			}
			else
				
				System.out.print(" "+a[i]+" ");
		}}}

		
				
		

	
		

	


