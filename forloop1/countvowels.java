package forloop1;

public class countvowels {

	public static void main(String[] args) {
		String a="kaviya";
		int count=0;
		int count1=0;
		for(int i=0;i<a.length();i++) {
			
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
				
				count=count+1;
			}
			else {
				//consonants
				count1++;
			}
			

	}
		System.out.println(count);
		System.out.println(count1);
	
}
}