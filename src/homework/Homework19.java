package homework;

import java.util.Arrays;

public class Homework19 {
    public static void main(String[] args) {
        System.out.println(noDigit(""));
        System.out.println(noDigit("Java"));
        System.out.println(noDigit("123Hello"));
        System.out.println(noDigit("123Hello World149"));
        System.out.println(noDigit("123Tech456Global149"));
        System.out.println();
        System.out.println(noVowel(""));
        System.out.println(noVowel("xyz"));
        System.out.println(noVowel("JAVA"));
        System.out.println(noVowel("125$"));
        System.out.println(noVowel("TechGlobal"));
        System.out.println();
        System.out.println(sumOfDigits(""));
        System.out.println(sumOfDigits("Java"));
        System.out.println(sumOfDigits("John's age is 29"));
        System.out.println(sumOfDigits("$125.0"));
        System.out.println();
        System.out.println(hasUpperCase(""));
        System.out.println(hasUpperCase("java"));
        System.out.println(hasUpperCase("John's age is 29"));
        System.out.println(hasUpperCase("$125.0"));
        System.out.println();
        System.out.println(middleInt(1,1,1));
        System.out.println(middleInt(1,2,2));
        System.out.println(middleInt(5,5,8));
        System.out.println(middleInt(5,3,5));
        System.out.println(middleInt(-1,25,10));
        System.out.println();
        int[] arr1 = {1, 2, 3 ,4};
        System.out.println(Arrays.toString(no13(arr1)));
        int[] arr2 = {13, 2, 3};
        System.out.println(Arrays.toString(no13(arr2)));
        int[] arr3 = {13, 13, 13 , 13, 13};
        System.out.println(Arrays.toString(no13(arr3)));
        System.out.println();
        int[] arr4 = {1, 2, 3 ,4};
        System.out.println(Arrays.toString(arrFactorial(arr4)));
        int[] arr5 = {0, 2, 4 , 1};
        System.out.println(Arrays.toString(arrFactorial(arr5)));
        int[] arr6 = {5 , 0, 6};
        System.out.println(Arrays.toString(arrFactorial(arr6)));
        System.out.println();
        System.out.println(Arrays.toString(categorizeCharacters(" ")));
        System.out.println(Arrays.toString(categorizeCharacters("abc123$#%")));
        System.out.println(Arrays.toString(categorizeCharacters("12ab$%3c%")));

    }

    //METHODS HERE
    public static String noDigit(String str) {
        return str.replaceAll("[0-9]", "");
    }

    public static String noVowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) sum += Integer.parseInt(str.substring(i, i + 1));
        }
        return sum;
    }

    public static boolean hasUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static int middleInt(int a, int b, int c){
      int[] nums = {a, b, c};
        Arrays.sort(nums);
        return nums[1];
    }

    public static int[] no13(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }

    public static int[] arrFactorial(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else {
                int fact = 1;
                for (int j = 1; j <= arr[i]; j++) {
                    fact *= j;
                }
                arr[i] = fact;
            }
        }
             return arr;
    }

    public static String[] categorizeCharacters(String str){
        String[] newArr = {"", "", ""};
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) newArr[0] += str.charAt(i);
            else if (Character.isDigit(str.charAt(i))) newArr[1] += str.charAt(i);
            else if (str.charAt(i) != ' ') newArr[2] += str.charAt(i);
        }
        return newArr;
    }

         //End Homework 19
}
