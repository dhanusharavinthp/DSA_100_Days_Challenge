//Method 1: Using second array to store and reverse array

	public static void reverse(int[] nums) {
		int n = nums.length;
		int j = 0;
		int arr[] = new int[n];
		for(int i =n-1; i>=0;i--) {
			arr[j]=nums[i];
			j++;
		}
		for(int i =0;i<n;i++) {
			nums[i]=arr[i];
		}

		
	}

//Method 2: Using 2 pointer (It saves memory)

	public static void reverse(int[] nums) {
		int n = nums.length;
		int left =0, right=n-1;
		while(left<right) {
			int temp = nums[left];
			nums[left]= nums[right];
			nums[right] = temp;
			left++;
			right--;
		}

		
	}

//Method 3: Using recursion function 

	public static void reverse(int nums[], int left, int right) {
		if(left>=right)
			return;
		int temp = nums[left];
		nums[left]= nums[right];
		nums[right]= temp;
		reverse(nums,left+1,right-1);
	}

	
