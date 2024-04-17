package overloading;

public class Useoverloading {

	public static void main(String[] args) {
		Overloading ov=new Overloading();
		System.out.println(ov.add(5, 5));
		System.out.println(ov.add(1.5f, 5.2f));
	System.out.println(ov.add(5, 5,5.2f));
		System.out.println(ov.add(5, 5.2f,5));
	}

}
