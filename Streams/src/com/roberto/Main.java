package com.roberto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	    List<String> bingoNumbers = Arrays.asList("N40", "N36",
                                                  "B12", "B6",
                                                  "G53", "G49", "G60", "G50", "g35",
                                                  "I26", "I17", "I29",
                                                  "O71");
	    List<String> gNumbers = new ArrayList<>();

//	    bingoNumbers.forEach(number -> {
//	        if(number.toUpperCase().startsWith("G")){
//                gNumbers.add(number);
//            }
//        });
//
//	    gNumbers.sort(String::compareTo);
//	    gNumbers.forEach(number -> System.out.println(number));

        bingoNumbers.stream()
                    .map(String::toUpperCase)
                    .filter(s -> s.startsWith("G"))
                    .sorted()
                    .forEach(System.out::println);

        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        System.out.println("-------------------------------------------------------");
        System.out.println(concatStream.distinct()
                                       .peek(System.out::println)
                                       .count());

        Employee john = new Employee("John Doe", 30);
        Employee jane = new Employee("Jane Doe", 28);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        Department hr = new Department("Human Resources");
        hr.addEmployee(jane);
        hr.addEmployee(jack);
        hr.addEmployee(snow);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
                   .flatMap(department -> department.getEmployees().stream())
                   .forEach(System.out::println);

        System.out.println("------------------ ");
        List<String> sortedGNumbers = bingoNumbers.stream()
                                                  .map(String::toUpperCase)
                                                  .filter(s -> s.startsWith("G"))
                                                  .sorted()
                                                  .collect(Collectors.toList());

        for (String s: sortedGNumbers) {
            System.out.println(s);
        }

        Map<Integer, List<Employee>> groupedByAge = departments.stream()
                                                               .flatMap(department -> department.getEmployees().stream())
                                                               .collect(Collectors.groupingBy(Employee::getAge));

        departments.stream()
                   .flatMap(department -> department.getEmployees().stream())
                   .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                   .ifPresent(System.out::println);

        Stream.of("ABC", "AC", "BAA", "CCC", "XY", "ST").filter( s -> {
            System.out.println(s);
            return s.length() == 3;
        }).count();
    }
}
