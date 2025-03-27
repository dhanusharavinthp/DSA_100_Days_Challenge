//Method 1: Using iterative approach
//efficient in both time and space

 public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) // If current element is greater than the next, it's not sorted
                return false;
        }
        return true; // If no violations, it's sorted
    }
 
//Method 2: Sorting and Comparing
//inefficient in both time and space
 
 public static boolean isSortedBySorting(int[] arr) {
     int[] sortedArr = arr.clone(); // Create a copy of the original array
     Arrays.sort(sortedArr); // Sort the copy
     return Arrays.equals(arr, sortedArr); // Check if original and sorted versions are the same
 }
 
 