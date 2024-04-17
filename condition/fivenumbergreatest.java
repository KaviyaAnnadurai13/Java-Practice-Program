package condition;

public class fivenumbergreatest {
	public static void main(String[] args) {
		int a = 222;
		int b = 536;
		int c = 799;
		int d = 494;
		int e = 365;
		if (a > b && a > c && a > d && a > e) {
			System.out.println(a + " is greatest");
		} else if (b > a && b > c && b > d && b > e) {
			System.out.println(b + " is greatest");
		} else if (c > a && c > b && c > d && c > e) {
			System.out.println(c + " is greatest");
		} else if (d > a && d > b && d > c && d > e) {
			System.out.println(d + " is greatest");
		} else {
			System.out.println(e + " is greatest");
		}

	}
}
