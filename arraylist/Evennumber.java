package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Evennumber {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		//ArrayList<Integer> num=Arrays.asList(10,20,20);
		nums.add(20);
		nums.add(6);
		nums.add(85);
		nums.add(95);
		nums.add(67);
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) % 2 == 0) {
				System.out.println(nums.get(i));
			}

		}
		// -------------------------------------------//
		for (Integer a : nums) {
			if (a % 2 != 0) {
				System.out.println(a);
			}

		}
		// ----------------------------------//
		Integer max = 0;
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) > max) {
				max = nums.get(i);
			}
			}
			System.out.println(max);
		
		// ------------------------------------//
		Integer min =nums.get(0);
		for (Integer b : nums) {
			if (b<min) {
				min = b;
			}
			}
			System.out.println(min);
			

	}

}
