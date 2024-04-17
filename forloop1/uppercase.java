package forloop1;

public class uppercase {
	public static void main(String[] args) {
		String s="KavIYA";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				System.out.println(s.charAt(i));
			}
			
		}
	}

}
