package day2;

public class usepen {
	public static void main(String[] args) {
		pen Pen1=new pen();
		Pen1.brand="Britto";
		Pen1.color="blue";
		Pen1.price=10;
		pen Pen2=new pen();
		Pen2.brand="godwin";
		Pen2.color="black";
		Pen2.price=20;
		System.out.println(Pen1.brand.toUpperCase());
		System.out.println(Pen2.brand.toUpperCase());
		System.out.println(Pen1.color.toUpperCase());
		System.out.println(Pen2.color.toUpperCase());
		System.out.println(Pen1.price+Pen2.price);
		System.out.println(Pen1.color.length()+1+Pen1.color.length()+1);
		char b=Pen1.brand.charAt(Pen1.brand.length()-1);
		System.out.println(b);
		
	}

}
