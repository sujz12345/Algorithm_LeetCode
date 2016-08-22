package com.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution_01 s= new Solution_01();
//		int[] nums1 =new int[]{1,2};
//		int[] nums2 =new int[]{1,1};
//		Utils.printArr(s.intersect(nums1, nums2));
		
		String str1 = "1011";
		String str2 = "101";
		
		System.out.println(s.addBinary2(str1, str2));
	}
	
	/** 350 Easy
	 * Given two arrays, write a function to compute their intersection.
	 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0){
        	return new int[0];
        }
		Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
        	int a = nums1[i];
        	int b = nums2[j];
        	if(a < b){
        		i++;
        	}else if(a > b){
        		j++;
        	}else{
        		list.add(a);
        		i++;
        		j++;
        	}
        }
        int[] arr = new int[list.size()];
        for (int k = 0; k < arr.length; k++) {
			arr[k] = list.get(k);
		}
        return arr;
    }
	/** 13 Easy
	 * Given a roman numeral, convert it to an integer.
	 * Input is guaranteed to be within the range from 1 to 3999
	 * @param s
	 * @return
	 */
	public int romanToInt(String s) {
        return 0;
    }
	
	/** 67. Add Binary(Easy)
	 * Given two binary strings, return their sum (also a binary string).
	 * For example,
	 * a = "11"
	 * b = "1"
	 * Return "100".
	 * @param a
	 * @param b
	 * @return
	 */
	public String addBinary(String a, String b) {
		String ret = "";
        int length = Math.max(a.length(), b.length());
        
        char[] carryArr = new char[length + 1];//进位器
        int pa = a.length();
        int pb = b.length();
		for(int i = 0;i <Math.abs(pa - pb) ; ++i){
        	if(a.length() > b.length()){
        		b = "0" + b;
        	}else{
        		a = "0" + a;
        	}
        }
		for(int i = 0; i< carryArr.length; ++i){
			carryArr[i] = '0';
		}
        for(int i = length - 1; i >= 0; --i){
        	char str1 = a.charAt(i);
        	char str2 = b.charAt(i);
        	char carry = carryArr[i+1];
        	if(str1 == '1' && str2 == '1'){
        		if(carry == '0'){
        			ret = "0" + ret;
        		}else{
        			ret = "1" + ret;
        		}
        		carryArr[i] = '1';
        	}else if(str1 == '0' && str2 == '0'){
        		if(carry == '0'){
        			ret = "0" + ret;
        		}else{
        			ret = "1" + ret;
        		}
        	}else{
        		if(carry == '0'){
        			ret = "1" + ret;
        		}else{
        			ret = "0" + ret;
        			carryArr[i] = '1';
        		}
        	}
        }
        if(carryArr[0] == '1'){
        	ret = "1" + ret;
        }
		return ret;
    }
	
	public String addBinary2(String a, String b) {
		if(a == null || a ==""){
			return b;
		}
		if(b == null || b ==""){
			return a;
		}
		StringBuilder ret = new StringBuilder();
		int la = a.length();
		int lb = b.length();
		int length = Math.max(la, lb);
		int flag = 0;
		while(length > 0){
			int ia = 0,ib = 0;
			if(la > 0){
				ia = a.charAt(la-1) == '0' ? 0 : 1;
				la--;
			}
			if(lb > 0){
				ib = b.charAt(lb-1) == '0' ? 0 : 1;
				lb--;
			}
			int r = ia + ib + flag;
			if(r >= 2){
				flag = 1;
				r -= 2;
			}else{
				flag = 0;
			}
			ret.insert(0,r);
			length--;
		}
		if(flag == 1){
			ret.insert(0, 1);
		}
		return ret.toString();
	}
	/** 66. Plus One(Easy)
	 * Given a non-negative number represented as an array of digits, plus one to the number.
	 * The digits are stored such that the most significant digit is at the head of the list.
	 * 
	 * @param digits
	 * @return
	 */
	public int[] plusOne(int[] digits) {
        return new int[0];
    }
	/** 7. Reverse Integer(Easy)
	 * Reverse digits of an integer.
		Example1: x = 123, return 321
		Example2: x = -123, return -321
	 * @param x
	 * @return
	 */
	public int reverse(int x) {
        return 0;
    }
	
    /** 8. String to Integer (atoi)(Easy)
     * Implement atoi to convert a string to an integer.

	Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

	Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
     * @param str
     * @return
     */
	public int myAtoi(String str) {
        return 0;
    }
    
	/** 12 Medium
	 * Given an integer, convert it to a roman numeral.
	 * Input is guaranteed to be within the range from 1 to 3999.
	 * @param num
	 * @return
	 */
	public String intToRoman(int num) {
        return null;
    }
	/** 2 Medium
	 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }
	/**
	 * 43. Multiply Strings(Medium)
	 * Given two numbers represented as strings, return multiplication of the numbers as a string.
		Note:
		The numbers can be arbitrarily large and are non-negative.
		Converting the input string to integer is NOT allowed.
		You should NOT use internal library such as BigInteger.
	 * @param num1
	 * @param num2
	 * @return
	 */
	public String multiply(String num1, String num2) {
        return null;
    }
	/**4. Median of Two Sorted Arrays(hard)
	 * 返回两个数组的中位数
	 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
		Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return 0D;
    }
	
	
	
	
	class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
	}

}
