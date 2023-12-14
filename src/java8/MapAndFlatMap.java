package java8;

import java.util.*;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) {
        List<String> add = new ArrayList<>();
        add.add("Mumbai");
        add.add("England");
        Employee e = new Employee(101, "John", 41, add);

        List<String> add1 = new ArrayList<>();
        add1.add("Pune");
        add1.add("Paris");
        Employee e1 = new Employee(102, "Michal", 43, add1);

        List<String> add2 = new ArrayList<>();
        add2.add("Bangalore");
        add2.add("Munich");
        Employee e2 = new Employee(103, "Andre", 39, add2);

        List<Employee> el = new ArrayList<>();
        el.add(e);
        el.add(e1);
        el.add(e2);

        List<List<String>> address = el.stream().map(Employee::getAddress).collect(Collectors.toList());
        System.out.println("address : " + address);

        List<String> fAddress = el.stream().flatMap(emp -> emp.getAddress().stream()).collect(Collectors.toList());
        System.out.println("fAddress : " + fAddress);

        List<Employee> elist = Arrays.asList(
                new Employee(101, "John", 30, Arrays.asList("Paris", "Munich"), "Software Developer"),
                new Employee(102, "Json", 32, Arrays.asList("NewYork", "Munich"), "IT"),
                new Employee(103, "Merry", 37, Arrays.asList("Paris", "NewYork"), "Software Tester"),
                new Employee(104, "Christ", 32, Arrays.asList("England", "Munich"), "IT"),
                new Employee(105, "Ronaldo", 37, Arrays.asList("Paris", "Munich"), "Software Tester"),
                new Employee(106, "Carry", 30, Arrays.asList("Pune", "Nagar"), "Software Developer")
        );

        Map<List<String>, Long> count = elist.stream().collect(Collectors.groupingBy(Employee::getAddress, Collectors.counting()));
        System.out.println("count : " + count);

        Map<String, Integer> countSum = elist.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.summingInt(Employee::getAge)));
        System.out.println("countSum : " + countSum);

        Map<Integer, List<Employee>> map = elist.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println("map : " + map);

        List<Integer> lstInt = Arrays.asList(1, 5, 2, 6, 8, 34, 2, 1, 2, 3, 4, 5, 6, 7, 8);
        Set<Integer> s = new HashSet<>();
        s.addAll(lstInt);
        List<Integer> newData = new ArrayList<>();
        newData.addAll(s);
        System.out.println(newData);

        Set<Integer> dupLst = lstInt.stream().filter(l -> Collections.frequency(lstInt, l) > 2).collect(Collectors.toSet());
        System.out.println(dupLst);

    }
}
