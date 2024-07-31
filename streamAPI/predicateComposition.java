package streamAPI;

import java.util.ArrayList;
import java.util.function.Predicate;

public class predicateComposition {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Abbu");
        strings.add("Ajaay");
        strings.add("Dhaanu");
        strings.add("Hari");
        strings.add("Raaju");
        Predicate<String> p1 = s -> s.length() > 5;
        Predicate<String> p2 = s -> s.matches(".*[a].*");
        strings.stream().filter(p1.and(p2)).forEach(System.out::println);
        
    }
}
