package forloop1;

public class primenumber {
	public static void main(String[] args) {
		int num = 9;
		boolean isprime = true;
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
			isprime = false;
			}
		}
		if (isprime == true) {
			System.out.println("The number is Prime number");
		} else {
			System.out.println("The Number is Not a Prime number");
		}
	}

}
