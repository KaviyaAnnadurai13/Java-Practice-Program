package forloop2;

public class oddstring {

	public static void main(String[] args) {
		String[] a= {"kaviya","kavi","ram","ravi"};
		for(int i=0;i<=a.length-1;i++) {
			if(a[i].length()%2!=0) {
				System.out.println(a[i]);
				
			}
		}
		
	}

}
