package homework;

public class Homework18 {
    public static void main(String[] args) {
        //Test Here
        System.out.println("\n------METHOD 1------");
        System.out.println(noSpace1("Hello      I am Kaycee"));
        System.out.println(noSpace2("Hello      I am Kaycee"));
        System.out.println(noSpace3("Hello      I am Kaycee"));
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

    }




}
