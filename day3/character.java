package day3;

public class character {

	public static void main(String[] args) {
	String[] n=args[0].split(",");
	String name=n[0];
	
	int num=Integer.parseInt(n[1]);
	String mail=n[2];
	String blood=n[3];
	long ph=Long.parseLong(n[4]);
	boolean b=Boolean.parseBoolean(n[5]);
	char c=n[6].charAt(0);
	 
	System.out.println("name="+ name);
	System.out.println("age="+num);
	System.out.println("mail="+mail);
	System.out.println("bloodgroup="+blood);
	System.out.println("phone number="+ph);
	System.out.println("ispresent="+b);
	System.out.println("character="+c);
	

}
}