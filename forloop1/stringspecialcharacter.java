package forloop1;

public class stringspecialcharacter {
	public static void main(String[] args) {
		int uppercasecount = 0;
		int lowercasecount = 0;
		int specialcount = 0;
		int numbercount = 0;
		String a = "KaviyaAnnadurai13@%2003";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				lowercasecount++;
			} else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
				uppercasecount++;
			} else if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
				numbercount++;
			} else {
				specialcount++;
			}
		}

		System.out.println("uppercase = " + uppercasecount);
		System.out.println("lowercase = " + lowercasecount);
		System.out.println("specialcount = " + specialcount);
		System.out.println("numbercount = " + numbercount);

	}

}
