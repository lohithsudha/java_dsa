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
