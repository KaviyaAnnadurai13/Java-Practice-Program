package forloop1;

public class oddcount {
	public static void main(String[] args) {
		int count = 0;
		int count1 = 0;
		for (int i = 250; i <= 350; i++) {
			if (i % 2 != 0) {
				count = count + 1;
			} else {
				count1 = count1 + 1;
			}
		}
		System.out.println("Odd Number = " + count);
		System.out.println("Even Number = " + count1);
	}

}
