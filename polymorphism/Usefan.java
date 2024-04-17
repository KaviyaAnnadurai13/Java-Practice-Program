package polymorphism;

public class Usefan {

	public static void main(String[] args) {
		//Fan f=new Fan();
		Electronics e=new Fan();
		System.out.println(e.add(5, 5));
		System.out.println(e.sub(2.5f,3.5f));
	}

}
