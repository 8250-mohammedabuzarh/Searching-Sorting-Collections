package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 4, 5, 3, 3};
        SelectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] SelectionSort(int[] arr)
    {
        int minIndex;
        int temp;
        for(int i=0;i< arr.length;i++)
        {
            minIndex=i;
            for(int j=i+1;j< arr.length;j++)
            {

                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }

            }
            temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
