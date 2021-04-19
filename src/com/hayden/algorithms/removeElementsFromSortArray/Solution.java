/**
 * 
 */
package com.hayden.algorithms.removeElementsFromSortArray;

/**
 * @author haydenwang
 *
 */
public class Solution {
	public int removeElement(int[] nums, int val) {
	    	if((nums == null) || (nums.length == 0)) {
	    		return 0;
	    	}
	    	
	    	int length = nums.length - 1;
	        int index = 0;
	        for(int i = 0; i <= length; i ++) {
	        	if(nums[i]  != val) {
	        		nums[index] = nums[i];
	        		index++;
	        	}
	        }
	        return index;
	        
	    }

    public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {0,1,2,2,3,0,4,2};
		int i = s.removeElement(nums, 2);
		System.out.println(i);
		print(nums, i - 1);
	}

	private static final void print(int[] nums, int index) {
		for (int i = 0; i <=index; i++) {
			System.out.print(" " + nums[i] + ",");
		}
	}
}
