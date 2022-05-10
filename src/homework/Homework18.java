package homework;

public class Homework18 {
    public static void main(String[] args) {
        //Test Here
        System.out.println(noSpace("Hello I am Kaycee"));
        System.out.println(replaceFirstLast("   K          "));
    }






    //Method 1
    /*
    Requirement:
    -Create a method called noSpace()
    -This method will take one String argument, and it will return a new String
     with all spaces removed from the original String
     */

    public static String noSpace(String str){
        return str.replaceAll("\\s", "");
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

        if (str.length() < 2) return "";
        return str.substring(str.length()-1) + str.substring(1, str.length()-1)
                + str.substring(0,1);
    }
}
