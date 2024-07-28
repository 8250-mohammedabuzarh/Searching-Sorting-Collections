package BinarySearch;

public class BitonicArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 8, 12, 4, 2};
        int peak;
        int low=0;
        int high=arr.length-1;
        peak = BitonicarrSearch(arr,low,high);
        System.out.println("Peak element is: "+peak);
    }
    public static int BitonicarrSearch(int[] arr, int low, int high)
    {
        if(low == high)
        {
            return arr[low];
        }
        if(low+1 == high)
        {
            return Math.max(arr[low], arr[high]);//return maximum in two elements
        }
        int mid = (low + high)/2;
        if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1])
        {
            return arr[mid];
        }
        if(arr[mid]<arr[mid+1])
        {
            return BitonicarrSearch(arr,mid+1,high);
        }
        else
        {
            return BitonicarrSearch(arr,low,mid-1);
        }

    }

}
