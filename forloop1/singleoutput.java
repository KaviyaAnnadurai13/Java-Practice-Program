package forloop1;

import java.util.Scanner;

public class singleoutput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int count=0;
		for(int i=1;i<=a;i++) {
			count++;
		}
		System.out.println(count);
//	int count=0;
//		for(int i=0;i<=50;i++) {
//			count=count+1;
//		}
//		System.out.println(count);
	}

}

