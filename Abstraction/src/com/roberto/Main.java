package com.roberto;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog pug = new Dog("Pug");
        pug.breathe();
        pug.eat();

        Parrot parrot = new Parrot("Captain's bird");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
