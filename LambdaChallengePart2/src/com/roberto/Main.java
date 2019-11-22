package com.roberto;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        challenge9();
//        challenge10();
//        challenge12();
//        challenge13();
        challenge14();
    }

    //Challenge #8
    /**
     * In order to map a lambda expression to a certain
     * interface in the Java SDK, this interface needs
     * to be a Functional Interface, in other words;
     * it should only have a single method to implement.
     *
     * BTW: A functional interface can have more than one
     * method, but all the methods must have default implementations
     *
     * --------------------------------------------------------
     *
     * Yes, you can use a lambda expression to represent an
     * instance of the java.util.concurrent.Callable interface,
     * since it is a Functional Interface, required the developer
     * to implement the single method: Call().
     *
     * Call() = () -> {};
     *
     * ---------------------------------------------------------
     *
     * Yes, the Comparator interface is a functional interface, since
     * it only requires the developer to implement the Compare() method.
     *
     * Compare(T o1, T o2) = (T o1, T o2) -> {}
     */

    //Challenge #9 && Challenge #10
    private static void challenge9(){
        List<String> topNames2015 = Arrays.asList("Amelia",
                                                  "Olivia",
                                                  "emily",
                                                  "Isla",
                                                  "Ava",
                                                  "oliver",
                                                  "Jack",
                                                  "Charlie",
                                                  "harry",
                                                  "Jacob");
        List<String> sortedTopNames = new ArrayList<>();
        topNames2015.forEach(e -> sortedTopNames.add(e.substring(0, 1).toUpperCase() + e.substring(1)));
//        sortedTopNames.sort(Comparator.naturalOrder());
//        sortedTopNames.forEach(System.out::println);
        sortedTopNames.sort(String::compareTo);
        sortedTopNames.forEach(System.out::println);
    }

    private static void challenge10(){
        List<String> topNames2015 = Arrays.asList("Amelia",
                                                    "Olivia",
                                                    "emily",
                                                    "Isla",
                                                    "Ava",
                                                    "oliver",
                                                    "Jack",
                                                    "Charlie",
                                                    "harry",
                                                    "Jacob");
        topNames2015.stream()
                    .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1))
                    .sorted(String::compareTo)
                    .forEach(System.out::println);
    }

    private static void challenge12(){
        List<String> topNames2015 = Arrays.asList("Amelia",
                                                "Olivia",
                                                "emily",
                                                "Isla",
                                                "Ava",
                                                "oliver",
                                                "Jack",
                                                "Charlie",
                                                "harry",
                                                "Jacob");
        long namesBeginningWithA = topNames2015.stream()
                                            .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1))
                                            .filter(e -> e.startsWith("A"))
                                            .count();
        System.out.println("Number of names that begin with the letter 'A' - " + namesBeginningWithA);
    }

    private static void challenge13(){
        List<String> topNames2015 = Arrays.asList("Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob");

        /**
         * Nothing will be printed out, because there is no Terminal operation, in order for a Stream
         * to execute intermediate operations, it needs a Terminal operation.
         */
        topNames2015.stream()
                .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo);
    }

    private static void challenge14(){
        List<String> topNames2015 = Arrays.asList("Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob");

        List<String> sortedTopNames2015 = topNames2015.stream()
                                                    .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                                                    .peek(System.out::println)
                                                    .sorted(String::compareTo)
                                                    .collect(Collectors.toList());
    }

}
