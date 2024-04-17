package arraylist;

import java.util.ArrayList;

public class Forloop {

	public static void main(String[] args) {
		ArrayList <Integer> nums=new ArrayList<>();
		nums.add(20);
        nums.add(6);
        nums.add(85);
        nums.add(95);
        nums.add(67);
        for(int i=0;i<nums.size();i++) {
        	System.out.println(nums.get(i));
        }
       System.out.println( "-----------------------------------");
        for(Integer a:nums) {
        	System.out.println(a);
        }
	}

}
