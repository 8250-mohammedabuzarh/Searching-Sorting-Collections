package LinearSearch;

public class Occuranceindices {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 4, 5, 3,3};
        int target = 3;
        int[] result = IndexSearch(arr, target);
        if (result != null) {
            for(int i=0;i<result.length;i++)
            {
                if(result[i]!=-1) {
                    System.out.print(result[i]+" ");
                }
            }
        } else {
            System.out.println("Not found");
        }

    }

    public static int[] IndexSearch(int[] arr, int target) {
        int[] index= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {

                index[i]=i;
            }
            else{
                index[i]=-1;
            }

        }

        return index;
    }
}
