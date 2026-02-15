package practice_4;

import java.util.Scanner;

public class SwitchZ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Напишите команду start, stop, restart или status ");
        String command = scanner.nextLine();

        switch (command) {
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система остановлена");
                break;
            case "restart":
                System.out.println("Система перезапущена");
                break;
            case "status":
                System.out.println("Статус системы");
                break;
            default:
                System.out.println("Неизвестная команда");
                break;
        }

    }
}
