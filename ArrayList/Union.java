package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Union {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1,2,3,4,6));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 1,2,3,4,6,7));
        ArrayList<Integer> result = Union(arr,arr2);
        //System.out.println(arr);
        System.out.println(result);

    }

    public static ArrayList<Integer> Union(ArrayList<Integer> arr,ArrayList<Integer> arr2) {
        ArrayList<Integer> list01 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if(!list01.contains(arr.get(i)))
                list01.add(arr.get(i));

        }
        for (int i = 0; i < arr2.size(); i++) {
            if(!list01.contains(arr2.get(i)))
                list01.add(arr2.get(i));

        }
        return list01;
    }
}
