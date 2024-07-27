package LinearSearch;

public class BasicSearch {

    public static void main(String[] args)
    {

        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int result = LinearSearch(arr,target);
        if(result!= -1)
        {
            System.out.println("Element found at index: "+result);
        }
        else {
            System.out.println("Not found");
        }

    }

    public static int LinearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==target)
            {
                return i;

            }

        }
        return -1;


    }


}
