package BinarySearch;

public class Largestele {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 4, 6, 8, 9};
            int target = 8;
            int result = BinarySearch(arr, target);
            if (result != -1) {
                System.out.println(" largest element that is smaller than or equal to a target value at index: " + (result-1));
            } else {
                System.out.println("Element not found");
            }
        }
        public static int BinarySearch(int[] arr,int target)
        {
            int start = 0;
            int end = arr.length-1;
            for (int i = start; i <=end; i--) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return 0;
        }
    }


