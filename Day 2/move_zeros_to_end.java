//Method 1: using Brute Force
//more space and time complexity

public static int[] movezero(int[] arr) {
	int result[] = new int[arr.length];
	int index = 0;
	for(int num: arr) {
		if(num!= 0) {
			result[index++]= num;
		}
	}
	return result;
}

//Method 2: using two pointer
//lesser space complexity

public static void movezero(int[] arr) {
	int j=0;
	for(int i = 0 ;i<arr.length;i++) {
		if(arr[i]!=0) {
			int temp = arr[i];
			arr[i]= arr[j];
			arr[j] = temp;
			j++;
		}
	}
}

//Method 3: Using optimized counting approach
//less sapce complexity

public static void movezero(int[] arr) {
	int count = 0;
	for(int i = 0;i<arr.length;i++) {
		if(arr[i]!=0)
			arr[count++] = arr[i];
	}
	while(count<arr.length)
		arr[count++]= 0;
}


