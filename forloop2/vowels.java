package forloop2;

public class vowels {

	public static void main(String[] args) {
		String[] s = { "fly", "sky", "kavi", "ram", "sun" };
		int count = 0;
		for (int i = 0; i < s.length; i++) {

			System.out.println(s[i]);
			if (s[i].length() % 2 == 0) {
				count++;
			}

		}
		System.out.println(count);
		for (int i = 0; i < s.length; i++) {
			if (s[i].contains("a") || s[i].contains("e") || s[i].contains("o") || s[i].contains("u")
					|| s[i].contains("i")) {
				System.out.println(s[i]);
			}
		}
		
		
		
		
		

	}
}
