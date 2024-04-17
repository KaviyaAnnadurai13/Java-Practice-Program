package forloop2;

public class maximumstring {

	public static void main(String[] args) {
		String[] val= {"kaviya","ram","ravi","annadurai"};
		String maxstring=val[0];
		for(int i=0;i<val.length;i++) {
			if(val[i].length()>maxstring.length()) {
				maxstring=val[i];
				
			}
		}
			System.out.println(maxstring);
			
		
	}

}
