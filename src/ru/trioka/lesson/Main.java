package ru.trioka.lesson;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int skolkoNas = 5;
        int rand = random.nextInt(skolkoNas) + 1;
        System.out.println("Отвечать будет " + randomName(rand));

        Dog max = new Dog("Макс");
        max.woof();
    }


    
    public static String randomName(int rand) {
        return switch (rand) {
            case 1 -> "Серегей Храмцов";
            case 2 -> "TanyRay";
            case 3 -> "Екатерина Бозунова";
            case 4 -> "Алексей";
            case 5 -> "Андрей";
            default -> "УчитеЛ сам ответит";
        };
    }
}
