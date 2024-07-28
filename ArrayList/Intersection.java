package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,  1,2,3,4,6));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 1,2,3,4,6,7));
        ArrayList<Integer> result = Commonele(arr,arr2);
        //System.out.println(arr);
        System.out.println(result);

    }

    public static ArrayList<Integer> Commonele(ArrayList<Integer> arr,ArrayList<Integer> arr2) {
        ArrayList<Integer> list01 = new ArrayList<>();
        for (int i = 0; i < arr2.size(); i++) {
                    if (arr.contains(arr2.get(i))) {
                        if (!list01.contains(arr2.get(i)))
                        list01.add(arr2.get(i));
                    }


        }
        return list01;
    }
}
