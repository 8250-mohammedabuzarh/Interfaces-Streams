package streamAPI;

import java.util.ArrayList;
import java.util.function.Consumer;

public class consumerinterfcae {
    public static void main(String[] args) {
        Consumer<ArrayList<String>> consumer = list -> {
            for (String s : list) {
                System.out.println(s.toUpperCase());
            }
        };
        ArrayList<String> list = new ArrayList<>();
        list.add("Abbu");
        list.add("Ajay");
        list.add("Dhanu");
        list.add("Hari");
        list.add("Raju");
        consumer.accept(list);


    }
}
