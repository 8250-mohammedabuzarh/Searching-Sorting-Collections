package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 1, 1,2,3));
        ArrayList<Integer> result = reverse(arr);
        System.out.println(arr);
        System.out.println(result);

    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> arr) {
        ArrayList<Integer> list01 = new ArrayList<>();
        for (int i = arr.size()-1; i>=0; i--) {

                list01.add(arr.get(i));

        }
        return list01;
    }
}
