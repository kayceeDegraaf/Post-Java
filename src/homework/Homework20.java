package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework20 {
    public static void main(String[] args) {
        //TEST HERE
        System.out.println(hasLowerCase("JAVA"));
        System.out.println(hasLowerCase("Java"));
        System.out.println(noZero(new ArrayList(Arrays.asList(0,0,0))));
        System.out.println(containsValue(new String[]{"abc", "def", "123", "java", "hello"}, "123"));
        System.out.println(reverseSentence("Java is kind of fun"));
        System.out.println(removeStringSpecialsDigits("123Java #$is fun"));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"})));
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("Java");
        str1.add("is");
        str1.add("fun");
        ArrayList<String> str2 = new ArrayList<>();
        str2.add("Java");
        str2.add("C#");
        str2.add("Python");
        System.out.println(removeAndReturnCommons(new ArrayList<>(str1), new ArrayList<>(str2)));
        ArrayList<String> list = new ArrayList<>();
        list.add("axbc");
        list.add("12X3");
        list.add("!@#x");
        System.out.println(noXInVariables(new ArrayList<>(list)));
    }
    //METHODS HERE
    /*
    This method will take a String argument, and it will return
     boolean true if there is lowercase letter and false if it isn’t.
     */
    public static boolean hasLowerCase(String str){
        boolean hasLowercase = false;
        for (int i = 0; i < str.length(); i++){
            if (Character.isLowerCase(str.charAt(i))) hasLowercase = true;
        }
        return hasLowercase;
    }

    /*
    This method will take one Integer ArrayList argument, and it will
     return an ArrayList with all zeros removed from the original Integer ArrayList.
     */
    public static ArrayList<Integer> noZero(ArrayList<Integer> numbers){
        ArrayList<Integer> withoutZero = new ArrayList<>();
        for (Integer number : numbers){
            if (number != 0) withoutZero.add(number);
        }
        return withoutZero;
    }

    /*
    This method will take an int array argument, and it will return
     a multidimensional array with all numbers squared.
     */
    public static int[][] numberAndSquare(int[] arr){
        int[][] multidimensional  = new int[arr.length][2];
        for(int i = 0; i < arr.length; i++){
            multidimensional [i][0]=arr[i];
            multidimensional [i][1] = arr[i] * arr[i];
        }
        return multidimensional ;
    }

    /*
    This method will take a String array and a String argument, and it will return a boolean.
    Search the variable inside the array and return true if it exists in the array.
    If it doesn't’t exist, return false.
    NOTE: Assume that array size is at least 1.
    NOTE: The method is case-sensitive
     */
    public static boolean containsValue(String[] arr, String str){
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, str) >= 0;
    }

    /*
    This method will take a String argument, and it will return a String with
    changing the place of every word. All words should be in reverse order.
    Make sure that there are two words inside the sentence at least.
    If there is no two words return “There is not enough words!”.
    NOTE: After you reverse, only first letter must be uppercase and the rest will be lowercase!
     */
    public static String reverseSentence(String str){
        String[] words = str.split(" ");
        if(words.length < 2) return "There is not enough words!";
        else{
            words[0] = (words[0].charAt(0) + "").toLowerCase() + words[0].substring(1);
            words[words.length-1] = (words[words.length - 1].charAt(0) + "").toUpperCase()+ words[words.length-1].substring(1);
            String reverse = "";
            for(int i = words.length - 1; i >= 0; i--){
                reverse+= words[i] + " ";
            }
            return reverse;
        }
    }

    /*
    This method will take a String as argument, and it will return a String without the
    special characters or digits.
    NOTE: Assume that String length is at least 1.
    NOTE: Do not remove spaces.
     */
    public static String removeStringSpecialsDigits(String str){
        return str = str.replaceAll("[^a-zA-Z ]", "");
    }

    /*
    This method will take a String array as argument, and it will return a
    String array without the special characters or digits from the elements.
    NOTE: Assume that array size is at least 1.
     */
    public static String[] removeArraySpecialsDigits(String[] arr){
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("[^a-zA-Z\\s]", "");
        }
        return arr;
    }

    /*
    This method will take two String ArrayList, and it will
    return all the common words as String ArrayList.
    NOTE: Assume that both ArrayList sizes are at least 1.
     */
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> str1, ArrayList<String> str2) {
        ArrayList<String> newList = new ArrayList<>();
        for (String s : str1) {
            for (String s2 : str2) {
                if (s.equals(s2) && !newList.contains(s)) newList.add(s);
            }
        }
        return newList;
    }

    /*
    This method will take an ArrayList argument, and it will return an
    ArrayList with all the x or X removed from elements.
    If the element itself equals to x or X, or contains only x letters, then
    remove that element.
    NOTE: Assume that ArrayList size is at least 1.
     */

    public static ArrayList<String> noXInVariables(ArrayList<String> strList){
        ArrayList<String> noX = new ArrayList<>();
        for (String str : strList){
            if (!str.toLowerCase().equals("x")){
                str = str.replaceAll("[xX]", "");
                noX.add(str);
            }
        }
        return noX;
    }

    //END METHODS
}
