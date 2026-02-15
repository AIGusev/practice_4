package practice_4;

import java.util.Scanner;

public class SwitchZ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели: ");
        String day = scanner.nextLine();

        switch (day) {
            case "понедельник":
            case "вторник":
            case "среда":
            case "четверг":
            case "пятница":
                System.out.println("Стоимость билета 300р.");
                break;
            case "суббота":
            case "воскресенье":
                System.out.println("Стоимость билета 450р.");
                break;
            default: {
                System.out.println("Неверный день недели");
            }

        }

    }
}
