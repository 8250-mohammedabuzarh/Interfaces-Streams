package streamAPI;

import java.util.ArrayList;
import java.util.Optional;

public class optionalHandling {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Optional<Integer> check = Optional.ofNullable(list.size());
        if(check.isPresent()){
            int max = list.stream().max(Integer::compare).get();
            System.out.println("Max value is: "+max);
        }
        else {
            System.out.println("List is empty");
        }

    }
}
