package streamAPI;

import java.util.ArrayList;

public class sumofSquares {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
       Integer result = arr.stream().filter(i -> i % 2 == 0).map(i -> i * i).reduce(0,(x,y) -> x+y);
        System.out.println("Sum of squares of even numbers"+result);
    }
}
