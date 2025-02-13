//starting from hello world
//1-1-2025(gfg)
class Solution {
    int missingNumber(int arr[]) {
        int n = arr.length;
        int sum = 0; // Initialize sum
        int product = 0; // Initialize product
        
        // Calculate the sum of first n+1 natural numbers
        for (int i = 1; i <= n + 1; i++) {
            sum += i;
        }
        
        // Calculate the sum of array elements
        for (int j = 0; j < n; j++) { // Use j < n to iterate over array
            product += arr[j];
        }
        
        return sum - product;
    }
    
    public static void main(String args[]) {
        int lohith[] = {1, 2, 3, 5};
        Solution solution = new Solution();
        int xx = solution.missingNumber(lohith);
        System.out.println(xx); // Output should be 4
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//second largest number in an array (gfg 1/1/2025)
public class Main{
    public static int second(){
        int arr[]={10,10,10};
        int n=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
           if(arr[i]>n){
               n=arr[i];
           }   
       }
       int m=Integer.MIN_VALUE;
       for (int j=0;j<arr.length;j++){
        if(arr[j]>m && arr[j]<n){
            m=arr[j];
        }
       }
       return m == Integer.MIN_VALUE ? -1 : m;
    

    }
    public static void main(String args[]){
        int a=second();
        System.out.println(a);
        
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
reversing a number(leetcode)
class Solution {
    public int reverse(int x) {
        int num=Math.abs(x);
        int rev=0;
        
        while(num!=0){
            int r=num%10;
            if (rev > (Integer.MAX_VALUE - r) / 10) {
                return 0;  
            }
            rev=rev*10+r;
            num=num/10;

           
        }
        return (x<0)?(-rev):rev;
}
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
(4/1/2025)-leetcode
    Given an array nums of integers, return how many of them contain an even number of digits.
Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2
    class Solution {
    public int findNumbers(int[] nums) {
        if(nums.length>=500 && nums.length<=1){
            return -1;
        }
        int div,count,r=0;
        for(int i=0;i<nums.length;i++){
            div=nums[i];
            if(nums[i]>=Math.pow(10,5) && nums[i]<=1){
                return -1;
            }
            count=0;
            while(div>0){
                div=div/10;
                count=count+1;
            }
            if(count%2==0){
                r=r+1;
            }
        }
        return r;
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
125. Valid Palindrome
Solved
Easy

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwisclass
    Solution {
    public boolean isPalindrome(String s) {
        int start=0,end=s.length()-1;
        
        while(start<end){
            char right =s.charAt(start);
            char left =s.charAt(end);
            if(!Character.isLetterOrDigit(right)){
                 start++;
            }
            else if(!Character.isLetterOrDigit(left)){
                end--;
            }
            else if(Character.toLowerCase(right)!=Character.toLowerCase(left)){
                return false;
            }
            else{
                end--;
                start++;
            }
        }
        return true;
        
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        int fibb[] = new int[n + 1];
        fibb[0] = 0;
        fibb[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibb[i] = fibb[i - 1] + fibb[i - 2];
        }
        
        return fibb[n];
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
268. Missing Number
Solved
Easy
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.class Solution {
    public int missingNumber(int[] nums) {
      int n=nums.length+1,sum=0;
      for(int i=0;i<nums.length;i++){
                sum+=nums[i];
      }
      int numbers_sum=n*(n+1)/2;
      return numbers_sum-(sum+n);
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation. 
class Solution {
    public boolean check(int[] arr) {
        int n = arr.length;
        int count = 0;
       for (int i = 0; i < n; i++) {
        // Check if current element is greater than the next (modulo for circular check)
        if (arr[i] > arr[(i + 1) % n]) {
            count++;
        }
        if (count > 1) { // More than 1 inversion => Not sorted and rotated
            return false;
        }
    

    return true; // Valid sorted and rotated array
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
283. Move Zeroes
Solved
Easy
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements
    class Solution {
    public void moveZeroes(int[] nums) {
       if(nums.length==0){
        return ;
       }
       int j=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
            nums[j++]=nums[i];
           }
       }
       while(j<nums.length){
        nums[j++]=0;
       }
    }
}
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Union of 2 Sorted with Duplicates(geeks for geeks)
    Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.
    class Solution {
    // Function to return a list containing the union of the two arrays
   
    
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
       
       if(a.length>=b.length){
           return comb(a,b);
       }
       else{
           return comb(b,a);
       }
        
       
    }
    public static ArrayList<Integer>  comb(int greater[],int lower[]){
        HashSet<Integer> set=new HashSet<Integer>();
       for (int i : lower) {
            set.add(i);
        }

        // Add all elements from the "greater" array to the set
        for (int i : greater) {
            set.add(i);
        }
       ArrayList<Integer> result = new ArrayList<>(set);

        // Sort the ArrayList
        Collections.sort(result);

        return result;
    }
    
}
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
485. Max Consecutive Ones
Solved
Easy
Given a binary array nums, return the maximum number of consecutive 1's in the array
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result=0;
        int count=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            result=result+1;
            if(result>count){
                count=result;
            }

        }
        else{
            result=0;
        }
       } 
       return count;
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Longest Subarray with sum K | [Postives and Negatives]
    class Solution {
    public int longestSubarray(int[] arr, int k) {
        int max = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            if (map.containsKey(sum - k)) {
                max = Math.max(max, i - map.get(sum - k));
            }
            
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return max;
    }
}

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
169. Majority Element
Easy

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array
class Solution {
    public int majorityElement(int[] nums) {
         int count = 0;
        int element = 0;

        for(int num : nums){
            if(count==0){
                element=num;
                count++;
            }else if(element == num){
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
53. Maximum Subarray
Medium Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum
    class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;  // Initialize to the smallest possible integer
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
121. Best Time to Buy and Sell Stock
Solved
Easy
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int profit=0;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
           if(min>prices[i]){
            min=prices[i]; 
           }
           profit=prices[i]-min;
           if(maxprofit<profit){
            maxprofit=profit;
           }
           
       
    }
     return maxprofit;
}
}
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
2149. Rearrange Array Elements by Sign
Solved
Medium
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
    class Solution {
    public int[] rearrangeArray(int[] nums) {
      
       int[] positive=new int[nums.length/2];
        int[] negative=new int[nums.length/2];
       int j=0;
           int k=0;
       for(int i=0;i<nums.length;i++){
           
           if(nums[i]>0){
               
               positive[j]=nums[i];
               j++;
           }
           else{
               
               negative[k]=nums[i];
               k++;
           }
       }
        int p=0;
           int q=0;
       for(int a=0;a<nums.length;a++){
          
          if(a%2==0 &&   p < positive.length){
              nums[a]=positive[p];
              p++;
             
          }
          else if( q <negative.length){
              nums[a]=negative[q];
              q++;
          }
       }
      return nums; 
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
4. Median of Two Sorted Arrays
Solved
Hard
    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).
    class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = merge(nums1, nums2);
        int n=mergedArray.length;
       
        
         if (n % 2 == 1) {
           
            return mergedArray[n / 2];
        } else {
           
            return (mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2.0;
        }
        
    }
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length]; 
        int i = 0, j = 0, k = 0;

        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

      
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        
        return result;
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Array Leaders
Difficulty: EasyAccuracy: 29.94%Submissions: 819K+Points: 2Average Time: 15m
You are given an array arr of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
    ArrayList<Integer> result=new ArrayList<Integer>();
    int n=arr.length;
    int max=arr[arr.length-1];
    result.add(arr[n-1]);
       for(int i=n-2;i>=0;i--){
           if(arr[i]>=max){
               result.add(arr[i]);
               max=arr[i];
           }
       }
      Collections.reverse(result);
       return result;
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        if (nums == null || nums.length == 0) return 0; // Edge case: empty array
        if (nums.length == 1) return 0; // Edge case: single element
        
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int diff = Math.abs(nums[i] - nums[(i + 1) % nums.length]);
            max = Math.max(max, diff);
        }
        return max;
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
