package com.hayden.algorithms.addTwoNumbers;

import java.io.Serializable;

class ListNode implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1461801401396642087L;
	int val;
	ListNode next;
	ListNode() {
	}
	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode finaleResult = new ListNode();
		if((null == l1) || (null == l2)) {
			return finaleResult;
		}
		int jump = 0;
		int l1Value = l1.val;
		int l2Value = l2.val;
		int sum = l1Value + l2Value;
		
		finaleResult.val = sum%10;
		if(sum > 10) {
			jump =1;
		}else {
			jump = 0;
		}
		ListNode current= finaleResult;

		while(l1.next != null) {
			ListNode l1Next = l1.next;
			ListNode l2Next = l2.next;
			l1Value = l1Next.val;
			l2Value = l2Next.val;
			sum = l1Value + l2Value + jump;
			ListNode result= new ListNode();
			result.val = sum%10;
			if(sum > 10) {
				jump =1;
			}else {
				jump = 0;
			}
			current.next = result;
			current = result;
		}
		
		if(jump == 1) {
			ListNode result= new ListNode();
			result.val = 1;
			current.next = result;
		}
//		while(finaleResult !=  null) {
//			System.out.print("" + finaleResult.val + ", ");
//			finaleResult = finaleResult.next;
//		}
		return finaleResult;
	}
	
	public static final void main(String[]args) {
		ListNode l1 = new ListNode();
		l1.val=8;
		ListNode l2 = new ListNode();
		l2.val =6;
		Solution s = new Solution();
		s.addTwoNumbers(l1, l2);
					
	}
}