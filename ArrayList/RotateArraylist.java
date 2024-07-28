package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 1, 1,2,3));
        int k = 2;
        ArrayList<Integer> result = rotate(arr,k);
        System.out.println(arr);
        System.out.println(result);

    }

    public static ArrayList<Integer> rotate(ArrayList<Integer> arr,Integer k) {
        ArrayList<Integer> list01 = new ArrayList<>();
        for (int i = k; i<arr.size(); i++) {

            list01.add(arr.get(i));

        }
        for (int i = 0; i<k; i++) {

            list01.add(arr.get(i));

        }
        return list01;
    }
}
