package day2;

public class arraylength {
	public static void main(String[] args) {
		String a="pythonprogramminglanguage";
		System.out.println(a.toUpperCase());
		//middle value
		char b=a.charAt(a.length()/2);
		System.out.println(b);
		//last value
		char c=a.charAt(a.length()-2);
        System.out.println(c);
		//substring
		String sub=a.substring(6,13);
		System.out.println(sub);
		
		char last=a.charAt(a.length()-3);
		System.out.println(last);
		char second=a.charAt(a.length()/2+4);
		System.out.println(second);
		System.out.println(a.indexOf("l"));
		String con=a.concat("The");
		System.out.println(con);
	
	}
}
