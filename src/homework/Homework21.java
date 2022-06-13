package homework;

public class Homework21 {
    public static void main(String[] args) {
        //test here
        System.out.println("Method 1");
        fizzBuzz1(3);
        System.out.println("Method 2");
        System.out.println(fizzBuzz2(15));
        System.out.println("Method 3");
        System.out.println(findSumNumbers("ab110c045d"));
        System.out.println("Method 4");
        System.out.println(findBiggestNumber("ab110c045d”"));
        System.out.println("Method 5");
        System.out.println(countSequenceOfCharacters("abbcca"));

    }

    //methods here

    public static void fizzBuzz1(int number){
        for (int i = 1; i <= number; i++){
            if (((i % 3 )== 0) && ((i % 5 )== 0)) System.out.println("FizzBuzz");
            else if ((i % 3) == 0) System.out.println("Fizz");
            else if ((i % 5) == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    public static String fizzBuzz2(int number){
        StringBuilder sb = new StringBuilder();
        if ((number % 15 ) == 0) sb.append("FizzBuzz");
        else if ((number % 3) == 0) sb.append("Fizz");
        else if ((number % 5) == 0) sb.append("Buzz");
        return sb.toString();
    }

    public static int findSumNumbers(String str){
        int sum = 0;
        boolean hasDigit = false;
        String s = str.replaceAll("[^0-9]", " ");
        String[] arr = s.split(" ");
        for (String s1 : arr) {
            if (s1.length() != 0) {
                sum += Integer.parseInt(s1);
                hasDigit = true;
            }
        }
        if (hasDigit)return sum;
        else return 0;
    }

    public static int findBiggestNumber(String str){
        int biggestNum = Integer.MIN_VALUE;
        boolean hasDigit = false;
        String s = str.replaceAll("[^0-9]", " ");
        String[] arr = s.split(" ");
        for (String s1 : arr) {
            if (s1.length() != 0){
                if (Integer.parseInt(s1)> biggestNum) {
                    biggestNum = Integer.parseInt(s1);
                    hasDigit = true;
                }
            }
        }
        if (hasDigit)return biggestNum;
        else return 0;
    }

    public static String countSequenceOfCharacters(String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        if (s.length() == 0) return "";
        else{
            for (int i = 0; i < s.length() - 1; i++) {
                count = 1;
                if (("" + s.charAt(i)).equals("" + s.charAt(i + 1))){
                    count ++;
                    i = i + count - 1;
                }
                sb.append(count).append(s.charAt(i));
            }
            if (!("" + s.charAt(s.length() - 1)).equals(("" + s.charAt(s.length() - 2)))) sb.append("1").append(s.charAt(s.length() - 1));

        }
        return sb.toString();
    }
}
