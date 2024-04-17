package forloop1;

public class halfreverse {

	public static void main(String[] args) {
		String a="orange";
		for(int i=0;i<a.length()/2;i++) {
			System.out.println(a.charAt(i));
			
		}
		System.out.println("----------------");	
		for(int i=a.length()/2-1;i>=0;i--) {
			System.out.println(a.charAt(i));
			
		}
		System.out.println("----------------");	
		for(int i=a.length()/2;i<a.length();i++) {
			System.out.println(a.charAt(i));
			
		}
		System.out.println("----------------");	
		for(int i=a.length()-1;i>=a.length()/2;i--) {
			System.out.println(a.charAt(i));
			
		}
		System.out.println("----------------");	
		}
		
	}


