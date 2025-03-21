//Method 1: Iterative method

public static int[] maxmin(int[] arr) {
	int min = arr[0];
	int max= arr[0];
	for(int i = 0;i<arr.length;i++) {
		if(arr[i]<min)
			min = arr[i];
		if(arr[i]>max)
			max= arr[i];
	}
	return new int[] {min,max};
	
}

//Method 2: Using Array sort method

import java.util.Arrays;

import trail.MinMax.Pair;

public static int[] maxmin(int[] nums) {
	Arrays.sort(nums);
	return new int[] {nums[0], nums[nums.length-1]};
}

//Method 3: Use Divide and Conquer method(similar to binary search)

static class Pair {
    int min, max;
}

public static Pair findMinMax(int[] arr, int low, int high) {
    Pair result = new Pair();

    // Base case: Single element
    if (low == high) {
        result.min = arr[low];
        result.max = arr[low];
        return result;
    }

    // Base case: Two elements
    if (high == low + 1) {
        if (arr[low] > arr[high]) {
            result.max = arr[low];
            result.min = arr[high];
        } else {
            result.max = arr[high];
            result.min = arr[low];
        }
        return result;
    }

    // Divide the array into two halves
    int mid = (low + high) / 2;
    Pair leftPair = findMinMax(arr, low, mid);
    Pair rightPair = findMinMax(arr, mid + 1, high);

    // Combine results
    result.min = Math.min(leftPair.min, rightPair.min);
    result.max = Math.max(leftPair.max, rightPair.max);

    return result;
}
