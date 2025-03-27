//Method 1: Using two pointers
//efficient in both time and space

 public static void findUnion(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) 
                System.out.print(arr1[i++] + " ");
            else if (arr1[i] > arr2[j]) 
                System.out.print(arr2[j++] + " ");
            else { 
                System.out.print(arr1[i++] + " ");
                j++;
            }
        }
        while (i < arr1.length) 
            System.out.print(arr1[i++] + " ");
        while (j < arr2.length) 
            System.out.print(arr2[j++] + " ");
    }
 public static void findIntersection(int[] arr1, int[] arr2) {
     int i = 0, j = 0;
     while (i < arr1.length && j < arr2.length) {
         if (arr1[i] < arr2[j]) 
             i++;
         else if (arr1[i] > arr2[j]) 
             j++;
         else { 
             System.out.print(arr1[i] + " ");
             i++;
             j++;
         }
     }
 }
 
