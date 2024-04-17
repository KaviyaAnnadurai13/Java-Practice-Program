package day3;

public class laptop1 {

	public static void main(String[] args) {
		String[] a=args[0].split("#");
		laptop l1=new laptop();
		l1.brand="Dell";
		l1.color="white";
		l1.price=25000;
		l1.inch=7.6f;
		l1.isTouchScreen=true;
		String[] b=args[1].split("@");
		laptop l2=new laptop();
		l2.brand="lenovo";
		l2.color="black";
		l2.price=45000;
		l2.inch=7.8f;
		l2.isTouchScreen=true;
		System.out.println(l1.brand);
		System.out.println(l1.color);
		System.out.println(l1.price);
		System.out.println(l1.inch);
		System.out.println(l1.isTouchScreen);
		System.out.println(l2.brand);
		System.out.println(l2.color);
		System.out.println(l2.price);
		System.out.println(l2.inch);
		System.out.println(l1.isTouchScreen);

	}

}
