package homework;

import java.util.*;

public class Homework22 {
    //Task-1
    public static int[] fibonacciSeries1(int num) {
        int[] arr = new int[num];
        if (num >= 1) arr[0] = 0;
        if (num >= 2) arr[1] = 1;
        for (int i = 0; i < arr.length - 2; i++) {
            arr[i + 2] = arr[i] + arr[i + 1];
        }
        return arr;
    }

    //Task-2
    public static int fibonacciSeries2(int num) {
        return fibonacciSeries1(num)[num - 1];
    }

    //Task-3
    public static int[] findUniques(int[] num1, int[] num2) {
        Set<Integer> uncommon = new HashSet<>();
        List<Integer> common = new ArrayList<>();
        for (int i1 : num1) for (int i2 : num2) if (i1 == i2) common.add(i1);
        for (int i : num1) if (!common.contains(i)) uncommon.add(i);
        for (int i : num2) if (!common.contains(i)) uncommon.add(i);

        int[] uniques = new int[uncommon.size()];
        int index = 0;
        for (Integer uncommons : uncommon) uniques[index++] = uncommons;
        return uniques;
    }

    //Task-4
    public static boolean isPowerOf3(int num) {

        while (num % 3 == 0) {
            num /= 3;
        }
        return (num == 1);
    }

    //Task-5
    public static int firstDuplicate(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) return arr[i];
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 5};
        int[] arr3 = {1,2,2,3};
        System.out.println(Arrays.toString(fibonacciSeries1(7)));
        System.out.println(fibonacciSeries2(8));
        System.out.println(Arrays.toString(findUniques(arr1, arr2)));
        System.out.println(isPowerOf3(81));
        System.out.println(firstDuplicate(arr3));
    }


}


