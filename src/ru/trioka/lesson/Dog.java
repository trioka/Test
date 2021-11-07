package ru.trioka.lesson;

public class Dog {

    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void woof() {
        System.out.println("Собака по имени " + name + " говорит \"Гав-гав!\"");
    }

    public void run(int meters) {
        System.out.println("Собака по имени " + name + " пробежала " + meters + " метров!");
    }

    public String getName() {
        return name;
    }
}

