package Hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class findAllDuplicatesInArr_lc442 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

    //this is a hashmap solution it got failed at last test case due to arraylist.contains overhead
//    public static List<Integer> findDuplicates(int[] arr) {
//        List<Integer> duplicates = new ArrayList<>();
//        HashMap<Integer , Integer> map = new HashMap<>();
//
//        for (int elem : arr) {
//            map.put(elem , map.getOrDefault(elem , 0) +1);
//        }
//
//        for (int j : arr) {
//            if (map.get(j) == 2 && !duplicates.contains(j)) {
//                duplicates.add(j);
//            }
//        }
//        return duplicates;
//    }

      public static List<Integer> findDuplicates(int[] arr) {
          List<Integer> duplicates = new ArrayList<>();

          for (int i = 0; i < arr.length ; i++) {
              int elemP = Math.abs(arr[i]);
              int index = elemP-1;
              if (arr[index] < 0) {
                  duplicates.add(elemP);
              }
              else {
                  arr[index] = -arr[index];
              }
          }
          return duplicates;
      }

}
