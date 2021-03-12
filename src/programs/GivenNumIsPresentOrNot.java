package programs;

import java.util.Scanner;

public class GivenNumIsPresentOrNot {
	static Boolean flag=false;
	public static void main(String[] args) {
		
	
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		 long s = sc.nextLong();
		 
		 System.out.println("Enter the Number to be searched1");
			Scanner sc1=new Scanner(System.in);
			 long no = sc1.nextLong();
		 while(s!=0) {
         long rem = s%100;
         if(rem==no)
        	 flag=true;
         s=s/10;
		 }   	 
        if(flag) 
        	System.out.println("present");
        else
        	System.out.println("not present");
	}
}


