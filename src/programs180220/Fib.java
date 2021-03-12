package programs180220;

public class Fib {

	public static void fib() {
		int fib1=0;
		int fib2=1;
		int fib3;
		System.out.print(fib1+" "+fib2+" ");
		for(int j=1;j<=10;j++) {
			fib3=fib1+fib2;
		fib1=fib2;
		fib2=fib3;
		System.out.print(fib3+" ");
		}
	}
	public static void main(String[] args) {
		
		fib();

	}

}
