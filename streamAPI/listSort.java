package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class listSort {
    public static void main(String[] args) {
        ArrayList<person> arr = new ArrayList<>();
        arr.add(new person("Abbu", 23,30000));
        arr.add(new person("Ajay", 15,30000));
        arr.add(new person("Dhanu", 13,30000));
        arr.add(new person("Soahil", 22,30000));
        arr.add(new person("Raju", 25,30000));
        arr.stream().sorted((p1,p2) -> p1.getAge().compareTo(p2.getAge())).forEach(System.out::println);
        //List<String> h = arr.stream().sorted(a1,a2) -> a1.getName().compareTo(a2.getName()).collect(Collectors.toList());
    }
}
