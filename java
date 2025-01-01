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

