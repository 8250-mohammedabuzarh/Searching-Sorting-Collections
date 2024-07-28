package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateEle {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 1, 1));
        ArrayList<Integer> result = Duplicates(arr);
        System.out.println(arr);
        System.out.println(result);

    }

    public static ArrayList<Integer> Duplicates(ArrayList<Integer> arr) {
        ArrayList<Integer> list01 = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))) {
                    if (!list01.contains(arr.get(i)))
                        list01.add(arr.get(i));


                }

            }

        }
        return list01;
    }



}
