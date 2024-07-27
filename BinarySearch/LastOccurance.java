package BinarySearch;

public class LastOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 6, 8, 8, 9};
        int target = 8;
        int result = BinarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
    public static int BinarySearch(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
        int lasti = -1;
        for (int i = start; i <=end; i++) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                lasti= mid;
                start = mid + 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return lasti;
    }
}
