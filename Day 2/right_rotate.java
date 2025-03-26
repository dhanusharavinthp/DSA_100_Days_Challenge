//Method 1: Using reversal algorithm
//less time and space complexity

 static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rightRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n; 
        reverse(arr, 0, n - 1);//entire array
        reverse(arr, 0, d - 1);//1st d elements
        reverse(arr, d, n - 1);//remaining elements
    }
    
//Method 2: using another array
//more space complexity

    static void rightRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {// to store 1st d elements in another array 
            temp[i] = arr[n - d + i];
        }
        // Shift the first N-D elements to the right
        for (int i = n - 1; i >= d; i--) {
            arr[i] = arr[i - d];
        }
        // Copy temp elements to the first D positions
        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }
    }