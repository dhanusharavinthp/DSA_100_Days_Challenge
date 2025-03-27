//Method 1: using sum fromula 
//efficient

 public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2; // Sum of numbers from 1 to n
        int actualSum = 0;

        for (int num : arr) 
            actualSum += num; // Sum of elements in array
        
        return expectedSum - actualSum; // The missing number
    }
 
//Method 2: using sorting
//inefficient
 
 public static int findMissingNumber(int[] arr, int n) {
     Arrays.sort(arr); // Sort the array

     for (int i = 0; i < arr.length; i++) {
         if (arr[i] != i + 1) return i + 1; // Find the missing number
     }
     return n; // If last number is missing
 }
 