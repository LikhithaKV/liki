package programs180220;

public class Nopalindrome {

	public static void main(String[] args) {
		int no=123324;
		int copy=no;
		int rem=0;
		int a=0;
		while(no!=0) {  
			 rem=no%10;
			a=(a*10)+rem;
			no=no/10;
			
		}
  if(a==copy)
	  System.out.println("palindrome");
  else
	  System.out.println("not palindrome");
	}

}
