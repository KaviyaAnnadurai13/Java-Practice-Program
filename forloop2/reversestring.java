package forloop2;

public class reversestring {

	public static void main(String[] args) {
		String[] a= {"kaviya","ram","ravi","kavi"};
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		for(int i=a.length-1;i>=0;i--) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}
		

	}

}
