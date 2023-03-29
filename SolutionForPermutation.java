package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SolutionForPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[scanner.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        List<Integer> list = new ArrayList<Integer>();
        permutation(nums, result, new ArrayList<Integer>());
        return result;
    }
//    list одна комбинация из всех , result все комбинации
    public static void permutation(int [] nums, List<List<Integer>> result, List<Integer> list) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if (list.contains(i)) {
                    continue;
                }
                list.add(i);
                permutation(nums,result, list);
                list.remove(list.size() - 1);
            }
        }

    }
}
