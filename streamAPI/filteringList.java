package streamAPI;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class filteringList {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Abbu");
        str.add("Ajay");
        str.add("Dhanu");
        str.add("Hari");
        str.add("Raju");
        str.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);
    }
}
