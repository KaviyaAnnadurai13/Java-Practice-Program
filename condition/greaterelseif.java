package condition;

public class greaterelseif {

	public static void main(String[] args) {
		int a=24;
		int b=6;
		int c=246;
		if(a>b && a>c) {
			System.out.println(a+" is greatest");
		}
		else if(b>c && b>a) {
			System.out.println(b+" is greatest");
		}
		else {
			System.out.println(c+" is greatest");
		}

	}

}
