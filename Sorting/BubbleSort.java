package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 4, 5, 3, 3};
        BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] BubbleSort(int[] arr){
        int temp;

        for(int i=0;i< arr.length-1;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        return arr;
    }
}
