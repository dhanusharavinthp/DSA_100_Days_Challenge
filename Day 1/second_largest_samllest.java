//Method 1: Using Array sort method

public static int[] second(int[] nums) {
		int n=nums.length;
		Arrays.sort(nums);
		return new int[] {nums[1], nums[n-2]};
	}

//Method 2: Using Single pass

public static void second(int[] nums) {
	if(nums.length<2) {
		System.out.println("Array must have atleast 2 elements");
		return;
	}
	int secondSmallest =Integer.MAX_VALUE, smallest = Integer.MAX_VALUE;
	int secondLargest =Integer.MIN_VALUE, largest = Integer.MIN_VALUE;
	for(int num: nums) {
		if(num<smallest) {
			secondSmallest=smallest;
			smallest= num;
		}else if(num<secondSmallest && num!=smallest) {
			secondSmallest = num;
		}
		
		if(num>largest) {
			secondLargest= largest;
			largest= num;
		}else if(num>secondLargest && num!=largest) {
			secondLargest = num;
		}
	}
	
	System.out.println("Second Smallest:"+ secondSmallest);
	System.out.println("Second Largest:"+ secondLargest);
}