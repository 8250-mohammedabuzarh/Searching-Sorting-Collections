package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 1, 1,2,3));
        ArrayList<Integer> result = remDuplicates(arr);
        System.out.println(arr);
        System.out.println(result);

    }

    public static ArrayList<Integer> remDuplicates(ArrayList<Integer> arr) {
        ArrayList<Integer> list01 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
                    if(!list01.contains(arr.get(i)))
                            list01.add(arr.get(i));

        }
        return list01;
    }
}
