package homework;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework23 {
    public static void main(String[] args) {

        //TASK1
        System.out.println("TASK1 = " + parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));

        //TASK2
        HashMap<String, Integer> t2Map = new HashMap<>();
        t2Map.put("Apple", 3);
        t2Map.put("Mango", 1);
        System.out.println("TASK2 = " + calculateTotalPrice1(t2Map));

        //TASK3
        HashMap<String, Integer> t3Map = new HashMap<>();
        t3Map.put("Apple", 4);
        t3Map.put("Mango", 8);
        t3Map.put("Orange", 3);
        System.out.println("TASK3 = " + calculateTotalPrice2(t3Map));
    }


    //TASK1
    public static TreeMap<Integer, String> parseData(String str) {
        TreeMap<Integer, String> results = new TreeMap<>();
        StringBuilder key = new StringBuilder();
        StringBuilder value = new StringBuilder();

        for (int i = 1; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))) {
                if (Character.isDigit(str.charAt(i)))
                    key.append(str.charAt(i));
                else value.append(str.charAt(i));
            } else if (str.charAt(i) == '{') {
                results.put(Integer.parseInt(key.toString()), value.toString());
                key = new StringBuilder();
                value = new StringBuilder();
            }
        }
        results.put(Integer.parseInt(key.toString()), value.toString());

        return results;
    }

    //TASK2
    public static double calculateTotalPrice1(Map<String, Integer> item) {
        Map<String, Double> price = new HashMap<>();
        double total = 0;
        price.put("Apple", 2.00);
        price.put("Orange", 3.29);
        price.put("Mango", 4.99);
        price.put("Pineapple", 5.25);
        for (String product : item.keySet()) {
            for (int i = 0; i < item.get(product); i++) {
                System.out.println(item.get(product));
                total += price.get(product);
            }
        }
        return (double) Math.round(total * 100) / 100;
    }

    //TASK3
    public static double calculateTotalPrice2(Map<String, Integer> item){
        double prices2 = 0.0;
        Map<String, Double> prices = new HashMap<>();
        prices.put("Apple", 2.00);
        prices.put("Orange", 3.29);
        prices.put("Mango", 4.99);

        if (item.get("Mango") >= 3) item.put("Mango", item.get("Mango") - (item.get("Mango") / 3));
        for (String s : item.keySet()) {
            if (s.equals("Apple")){
                if (item.get("Apple") % 2 == 1) prices2 += (item.get("Apple") - 1) * 1.5 + 2;
                else prices2 += item.get("Apple") * 1.5;
            }
            else prices2 += prices.get(s) * item.get(s);
        }

        return prices2;

    }


















}



