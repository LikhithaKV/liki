package programs;

import java.util.Scanner;

public class ExtractAlphabetDigitSpecCharFromEmailId {

	public static void main(String[] args) {
		System.out.println("Enter the email id");
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		int alpha=0;
		int digit=0;
		int spe=0;
		for (int i = 0; i < s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				alpha++;
			}
			else if(Character.isDigit(s.charAt(i))) {
				digit++;
			}
			else 
				spe++;
			}
		System.out.println("no's are "+alpha);
		System.out.println("digit's are "+digit);
		System.out.println("special char's are "+spe);
		
	}

}
