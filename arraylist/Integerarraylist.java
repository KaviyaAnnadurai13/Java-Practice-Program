package arraylist;

import java.util.ArrayList;

public class Integerarraylist {

	public static void main(String[] args) {
		ArrayList <Integer> nums=new ArrayList<>();
		nums.add(20);
        nums.add(6);
        nums.add(85);
        nums.add(95);
        nums.add(67);
        nums.forEach(a->System.out.println(a));
        //even
        nums.forEach(a->{
   
        if(a%2==0) {
        	System.out.println(a);
        	}
        });
        System.out.println(nums);
        nums.set(1,10);
        System.out.println(nums);
        nums.remove(3);
        System.out.println(nums);
        nums.get(2);
        System.out.println(nums);
        
        System.out.println(nums.size());

	}

}

