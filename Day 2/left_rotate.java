//Method 1: Using reversal approach ( optimal solution)
// less space and time complexity

public class LeftRotateArray {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotateUsingReversal(int[] arr, int d) {
        int n = arr.length;
        d = d % n;  
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }
    
//Method 2: using temp array (brute force)
//not efficient high space complexity
    
    public static void leftRotateUsingTempArray(int[] arr, int d) {
        int n = arr.length;
        d = d % n;  
        int[] temp = new int[d];
        System.arraycopy(arr, 0, temp, 0, d);
        System.arraycopy(arr, d, arr, 0, n - d);
        System.arraycopy(temp, 0, arr, n - d, d);
    }
    
//Method 3: using 