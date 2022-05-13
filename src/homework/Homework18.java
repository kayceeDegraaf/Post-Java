package homework;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Homework18 {
    public static void main(String[] args) {
        //Test Here
        System.out.println("\n------METHOD 1------");
        System.out.println(noSpace1(""));
        System.out.println(noSpace1("Java"));
        System.out.println(noSpace2("   Hello   "));
        System.out.println(noSpace3(" Hello World   "));
        System.out.println(noSpace3("Tech Global"));
        System.out.println("\n------METHOD 2------");
        System.out.println(replaceFirstLast(""));
        System.out.println(replaceFirstLast("A"));
        System.out.println(replaceFirstLast("   A   "));
        System.out.println(replaceFirstLast("Hello"));
        System.out.println(replaceFirstLast("Tech Global"));
        System.out.println("\n------METHOD 3------");
        System.out.println(hasVowel(""));
        System.out.println(hasVowel("Java"));
        System.out.println(hasVowel("1234"));
        System.out.println(hasVowel("ABC"));
        System.out.println("\n------METHOD 4------");
        checkAge(2006);
        checkAge(2005);
        checkAge(2050);
        checkAge(1920);
        checkAge(1800);
        System.out.println("\n------METHOD 5------");
        System.out.println(averageOfEdges(0, 0, 0));
        System.out.println(averageOfEdges(0, 0, 6));
        System.out.println(averageOfEdges(-2, -2, 10));
        System.out.println(averageOfEdges(-3, 15, -3));
        System.out.println(averageOfEdges(10, 13, 20));
        System.out.println("\n------METHOD 6------");
        String[] data1 = {"java", "hello", "123", "xyz"};
        System.out.println(Arrays.toString(noA(data1)));
        String[] data2 = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(data2)));
        String[] data3 = {"apple", "appium", "ABC", "Alex", "A"};
        System.out.println(Arrays.toString(noA(data3)));
        System.out.println("\n------METHOD 7------");
        int[] test1 = {7, 4, 11, 23, 17};
        System.out.println(Arrays.toString(no3or5(test1)));
        int[] test2 = {3, 4, 5, 6};
        System.out.println(Arrays.toString(no3or5(test2)));
        int[] test3 = {10, 11, 12, 13, 14, 1};
        System.out.println(Arrays.toString(no3or5(test3)));
        System.out.println("\n------METHOD 8------");
        int [] testData1 = {-10, -3, 0, 1};
        System.out.println(countPrimes(testData1));
        int [] testData2 = {7, 4, 11, 23, 17};
        System.out.println(countPrimes(testData2));
        int [] testData3 = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(testData3));
    }




    //Method 1
    /*
    Requirement:
    -Create a method called noSpace()
    -This method will take one String argument, and it will return a new String
     with all spaces removed from the original String
     */

    public static String noSpace1(String str){
        return str.replaceAll("\\s", "");
    }

    public static String noSpace2(String str){
        String result = "";
        for (int i = 0; i <str.length(); i++){
            if (!Character.isWhitespace(str.charAt(i))) result += str.charAt(i);
        }
        return result;
    }

    public static String noSpace3(String str){
        String result = "";
        for (char element : str.toCharArray()){
            if (element != ' ') result += element;
        }
        return result;
    }


    //Method 2
    /*
    Requirement:
    -Create a method called replaceFirstLast()
    -This method will take one String argument, and it will return a new String with
    first and last characters replaced
    NOTE: if the length is less than 2, then return empty String
    NOTE: Ignore all before and after spaces (get actual String only)
     */
    public static String replaceFirstLast(String str){
        if (str.trim().length() < 2) return "";
        return str.substring(str.length()-1) + str.substring(1, str.length()-1) + str.substring(0,1);
    }

    //Method 3
    /*
    Requirement:
    -Create a method called hasVowel()
    -This method will take one String argument, and it will return a boolean
     checking if String has any vowel or not
    NOTE: Vowels are = a, e, o, u, I
    NOTE: Ignore cases

     */

    public static boolean hasVowel(String str){
        boolean vowel = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e' ||
                    str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'o'
            || str.toLowerCase().charAt(i) == 'u') vowel = true;
        }
        return vowel;
    }

    //METHOD 4
    /*
    Requirement:
    -Create a method called checkAge()
    -This method will take an int yearOfBirth as  argument, and it will print message below based on the entry
    If the age is less than 16, then print “AGE IS NOT ALLOWED”
    If the age is 16 or more, then print “AGE IS ALLOWED”
    If the age is more than 100 or a future year entered, print “AGE IS NOT VALID”
    NOTE: Calculate the age taking base year as current year in a dynamic way. You can use Date class.
     */

    public static void checkAge(int yearOfBirth){
        Date current = new Date();
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        int age = Integer.parseInt(year.format(current)) - yearOfBirth;
        if (age > 100 || age < 0) System.out.println("AGE IS NOT VALID");
        else if (age < 16 && age > 0) System.out.println("AGE IS NOT ALLOWED");
        else System.out.println("AGE IS ALLOWED");
    }

    //METHOD 5
    /*
    Requirement:
    -Create a method called averageOfEdges()
    -This method will take three int arguments, and it will return average of min and max numbers
     */
    public static int averageOfEdges(int a, int b, int c){
        return (Math.max(Math.max(a, b),c) + Math.min(Math.min(a,b),c)) /2;
    }

    //METHOD 6
    /*
    Requirement:
    -Create a method called noA()
    -This method will take a String array argument, and it will return a new array
    with all elements starting with A or a replaced with “###”
     */
    public static String[] noA(String[] str){
        String[] newArr = new String[str.length];
        for (int i = 0; i < str.length; i++){
            if (str[i].toLowerCase().startsWith("a")) newArr[i] = "###";
            else newArr[i] = str[i];
        }
        return newArr;
    }

    //METHOD 7
    /*
    Requirement:
    -Create a method called no3or5()
    -This method will take an int array argument, and it will return a new array
    with some elements replaced as below
    If element can be divided by 5, replace it with 99
    If element can be divided by 3, replace it with 100
    If element can be divided by both 3 and 5, replace it with 101
    NOTE: Assume length will always be more than zero
     */
    public static int[] no3or5(int[] nums){
        int[] newArr = new int[nums.length];
        int index = 0;
        for (int element : nums){
            if (element % 15 == 0) newArr[index++] = 101;
            else if (element % 5 == 0) newArr[index++] = 99;
            else if (element % 3 == 0) newArr[index++] = 100;
            else newArr[index++] = element;
        }
        return newArr;
    }

    //METHOD 8
    /*
    Requirement:
    -Create a method called countPrimes()
    -This method will take an int array argument, and it will return
     how many elements in the array are prime numbers
    NOTE: Prime number is a number that can be divided only by 1 and itself
    NOTE: Negative numbers cannot be prime
    Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
    NOTE: Smallest prime number is 2
     */

    public static int countPrimes(int[] nums){
        int count = 0;
        for (int element : nums){
            boolean prime = true;
            if (element < 2) continue;
            for (int i = 2; i < element; i++){
                if (element % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) count++;
        }
        return count;
    }




}
