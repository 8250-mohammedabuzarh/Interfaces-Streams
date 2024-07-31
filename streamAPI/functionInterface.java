package streamAPI;

import java.util.function.Function;

public class functionInterface {
    public static void main(String[] args) {
        Function<Integer,Double> area = r -> 3.14*r*r;
        System.out.println("Area of a Circle: "+area.apply(5));
    }
}
