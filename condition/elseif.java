package condition;

import java.util.Scanner;

public class elseif {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=s.nextInt();
	//System.out.println(num);
		
		
		if(num>0) {
			System.out.println(num+" is positive");
		}
		else if(num==0) {
			System.out.println(num+" is neutral");
		}
		else {
			System.out.println(num+" is negative");
		}
	}

}
