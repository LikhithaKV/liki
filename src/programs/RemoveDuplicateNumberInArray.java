package programs;

public class RemoveDuplicateNumberInArray {

	public static void main(String[] args) {
		int [] a= {10,20,10,30,20,40,50};
		int n=a.length;
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {
				for (int j = i+1; j < a.length; j++) {
					if(a[i]==a[j]) {
						a[j]=0;
					}
				}
			}
		}
		
   for (int i = 0; i < a.length; i++) {
	if(a[i]!=0)
		System.out.println(a[i]);
}
	}

}
