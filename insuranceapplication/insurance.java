package insuranceapplication;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class insurance {
    public static void main(String[] args) {
        ArrayList<insurancepolicy> list = new ArrayList<>();
        list.add(new insurancepolicy("101", "Abbu", 1001.0));
        list.add(new insurancepolicy("102", "Ajay", 1900.0));
        list.add(new insurancepolicy("103", "Dhanu", 3000.0));
        list.add(new insurancepolicy("104", "Sohail", 4000.0));
        list.add(new insurancepolicy("105", "Raju", 5000.0));


        System.out.println("\nInsurance policies with premium amount greater than 1200.0\n");
        list.stream().filter(p -> p.getPremiumAmount() > 1200.0).forEach(System.out::println);


        System.out.println("\nInsurance policies with sorted policy holder names\n");
        list.stream().sorted((p1, p2) -> p1.getPolicyHolderName().compareTo(p2.getPolicyHolderName())).forEach(System.out::println);

        double total = list.stream().mapToDouble(p -> p.getPremiumAmount()).sum();
        System.out.println("\nTotal premium amount of all insurance policies\n"+total);

        System.out.println("\nDetails of Insurance Policy are: "+list);

        System.out.println("\nInsurance plolicies with premium amount between 1000 and 2000\n");
        list.stream().filter(p -> p.getPremiumAmount() > 1000.0 && p.getPremiumAmount() < 2000.0).forEach(System.out::println);

        System.out.println("\npolicy with highest premium amount\n");
        insurancepolicy max = list.stream().max(Comparator.comparing(insurancepolicy::getPremiumAmount)).get();
        System.out.println(max);

        System.out.println("\nPolicies grouping with policy holder name initials\n");
        Map<Character, List<insurancepolicy>> map = list.stream().collect(Collectors.groupingBy(p -> p.getPolicyHolderName().charAt(0)));
        System.out.println(map);

        System.out.println("\nAverage of Insurance policies premium amount\n");
        double Average = list.stream().mapToDouble(p -> p.getPremiumAmount()).average().getAsDouble();
        System.out.println(Average);

        System.out.println("\nInsurance policy details with sorted premeium amount\n");
        list.stream().sorted((p1, p2) -> p1.getPremiumAmount().compareTo(p2.getPremiumAmount())).forEach(System.out::println);

        System.out.println("\nPolicy with premeium amount greater than 2000\n");
        list.stream().filter(p -> p.getPremiumAmount() > 2000.0).forEach(System.out::println);

        










    }

}
