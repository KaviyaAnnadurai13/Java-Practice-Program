package forloop1;

public class lowercase {

	public static void main(String[] args) {
		String s="KaviyA";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
				System.out.println(s.charAt(i));
			}
		}

	}

}
