package com.roberto;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author Roberto Affonso, created on 09/01/18
 **/

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");

        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");

        printList(placesToVisit);

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> placesToVisit) {
        Iterator<String> i = placesToVisit.iterator();
        while (i.hasNext()) {
            System.out.println("Now Visiting: " + i.next());
        }
        System.out.println("============================");
    }

    private static boolean addInOrder(LinkedList<String> placesToVisit, String city) {
        ListIterator<String> i = placesToVisit.listIterator();
        while (i.hasNext()) {
            int comparison = i.next().compareTo(city);
            if (comparison == 0) {
                System.out.println(city + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                i.previous();
                i.add(city);
                return true;
            } else if (comparison < 0) {

            }
        }

        i.add(city);
        return true;
    }

    public static void visit(LinkedList<String> cities){
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<String> i = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itinerary");
            return;
        }
        else{
            System.out.println("Now visiting: " + i.next());
            printMenu();
        }

        while(!quit){
            int action = input.nextInt();
            input.nextLine();

            switch (action){
                case 0:
                    System.out.println("Vacation over");
                    quit = true;
                    break;

                case 1:
                    if(!forward){
                        if(i.hasNext()){
                            i.next();
                        }
                        forward = true;
                    }
                    if(i.hasNext()){
                        System.out.println("Now Visiting: " + i.next());
                    }
                    else{
                        System.out.println("You have reached the end of the list.");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward){
                        if(i.hasPrevious()){
                            i.previous();
                        }
                        forward = false;
                    }
                    if(i.hasPrevious()){
                        System.out.println("Now visiting: " + i.previous());
                    }
                    else {
                        System.out.println("You have reached the beginning of the list");
                        forward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available Actions\npress ");
        System.out.println("0 - to quit\n" +
        "1 - To go forward\n" +
        "2 - To go backwards\n" +
        "3 - To dispĺay the menu options");
    }
}
