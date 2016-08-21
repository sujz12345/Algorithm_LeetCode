package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	      @Override
	    public String toString() {
	    	return val + "";
	    }
	  }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s = new Solution();
		
		
	}
	
	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i =0; i < nums.length; ++i){
        	map.put(target - nums[i],i);
        }
        for(int i = 0; i < nums.length; ++i){
        	Integer index = map.get(nums[i]);
        	if(index != null && index != i){
        		int[] a= new int[2];
        		a[0] = index;
        		a[1] = i;
        		return a;
        	}
        }
        return new int[0];
    }
	
	public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; ++i){
        	if(nums[i] == nums[i+1])return true;
        }
		return false;
    }
	
	
	public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
		int[] arr = new int[26];
        for(int i = 0; i < s.length(); ++i){
        	arr[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); ++i){
        	if(--arr[t.charAt(i) - 'a'] < 0){
        		return false;
        	}
        }
		return true;
    }
	public boolean canConstruct2(String ransomNote,String magazine){
		int[] arr = new int[26];
		for(int i = 0;i < magazine.length(); ++i){
			arr[magazine.charAt(i)-'a']++;
		}
		for(int i = 0; i < ransomNote.length(); ++i){
			if(arr[ransomNote.charAt(0) - 'a']-- <= 0){
				return false;
			}
			
		}
		return true;
	}
	
	public boolean canConstruct(String ransomNote, String magazine) {
        char[] arr = ransomNote.toCharArray();
        char[] marr = magazine.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < marr.length; ++ i){
        	char a = marr[i];
        	Integer count = map.get(a);
        	if(count == null){
        		map.put(a, 1);
        	}else{
        		count++;
        		map.put(a, count);
        	}
        }
        
        for(int i =0; i < arr.length; ++i){
        	char t = arr[i];
        	Integer count = map.get(t);
        	if(count == null || count ==0){
        		return false;
        	}else{
        		count--;
        		map.put(t, count);
        	}
        }
		return true;
    }
	public void moveZeroes2(int[] nums) {
        int i = 0;
        int j = 0;
        while(i < nums.length){
        	int t = nums[i];
        	if(t != 0){
        		if(i != j){
        			nums[j++] = nums[i];
            		nums[i] = 0;
        		}else{
        			++j;
        		}
        		
        	}
        	i++;
        }
    }
	public void moveZeroes(int[] nums) {
        int j = nums.length;
		for(int i = 0; i < j; ++i){
        	int t = nums[i];
        	if(t == 0){
        		for(int k = i; k < j-1; k++){
        			nums[k] = nums[k+1];
        		}
        		nums[j-1] = t;
        		j--;
        		i--;
        	}
        }
    }
	
	public String reverseString(String s) {
		char[] arr = s.toCharArray();
		for(int i = 0; i < arr.length/2; ++i){
			char t = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = t;
		}
		return new String(arr);
    }
	
	public int addDigits(int num) {
		while(num >= 10){
			int divider = num;
			num = 0;
	        while(divider != 0){
	        	int remainder = divider % 10;
	        	num += remainder;
	        	divider = divider /10;
	        }
		}
		
//		while(num>=10){  
//            num = (num/10)+num%10;  
//        }  
//        return num;  
		return num;
    }
	
	public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int l = maxDepth(root.left)+1;
        int r = maxDepth(root.right)+1;
        return l > r? l : r;
    }
	 
	public TreeNode invertTree(TreeNode root) {
		if(root == null)return null;
		invertTree(root.left);
		invertTree(root.right);
		TreeNode t = root.left;
		root.left = root.right;
		root.right = t;
        return root;
    }
	
	private void printIntArr(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
		
		public void deleteNode(ListNode node) {
			node.val = node.next.val;
	        node.next = node.next.next;
	    }
	}
	 
	 
	 
}
