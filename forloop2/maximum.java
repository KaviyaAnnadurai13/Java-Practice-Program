package forloop2;

public class maximum {
	public static void main(String[] args) {
           int[] nums= {34,90,100,205,300};
           int max=nums[0];
           for(int i=0;i<nums.length;i++) {
        	   if(nums[i]>max) {
        	   max=nums[i];
           }
           }
           System.out.println(max);
}
}
