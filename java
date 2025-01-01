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
