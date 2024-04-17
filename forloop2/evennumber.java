package forloop2;

public class evennumber {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5};
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				System.out.println(nums[i]);
			}
		}
	}

}
