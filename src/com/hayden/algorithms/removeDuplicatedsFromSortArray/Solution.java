/**
 * 
 */
package com.hayden.algorithms.removeDuplicatedsFromSortArray;

/**
 * @author haydenwang
 *
 */
public class Solution {
	public int removeDuplicates(int[] nums) {
	    	if((nums == null) || (nums.length == 0)) {
	    		return 0;
	    	}
	    	
	    	int length = nums.length;
	        int i = 0; int index = 1;
	        for(; index < length; ) {
	        	if(nums[i]  == nums[index]) {
	        		//nums[index] = -1; 
	        		index++;
	        	}else {
	        		i ++;
	        		nums[i] = nums[index]; 
	        		index ++;
	        	}
	        }
	        return i+1;
	        
	    }

    public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = { 0,0,1,1,1,2,2,3,3,4};
		int i = s.removeDuplicates(nums);
		System.out.println(i);
		print(nums, i - 1);
	}

	private static final void print(int[] nums, int index) {
		for (int i = 0; i <=index; i++) {
			System.out.print(" " + nums[i] + ",");
		}
	}
}
