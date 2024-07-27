package LinearSearch;
import java.util.Scanner;
public class StringSearch {
    public static int StringSearch(String[] arr, String target)
    {
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i].equals(target))
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       // String[] arr = {"abbu","ajay","dhanu"};
        //String target = "abbu";
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        System.out.println("Enter elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextLine();
        }
        System.out.println("Enter the target: ");
        String target = sc.next();
        int result = StringSearch(arr,target);
        if(result!=-1)
        {
            System.out.println("String found at index: "+result);
        }
        else {
            System.out.println("String not found");
        }
    }


}
