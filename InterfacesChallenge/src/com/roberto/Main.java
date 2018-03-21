package com.roberto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player1 = new Player("John", 50, 25);
        Monster monster1 = new Monster("Cyborg", 100, 4, "Regular");

        saveObject(player1);
        loadObject(player1);
        System.out.println(player1.toString());

        saveObject(monster1);
        loadObject(monster1);
        System.out.println(monster1.toString());
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner input = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while(!quit){
            System.out.println("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = input.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(IChallenge objectToSave){
        for(int i = 1; i < objectToSave.saveValues().size(); i++){
            System.out.println("Saving " + objectToSave.saveValues().get(i) + " To storage device");
        }
    }

    public static void loadObject(IChallenge objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.readValues(values);

        for(int i = 0; i < values.size(); i++){
            System.out.println(values.get(i).toString());
        }
    }
}
