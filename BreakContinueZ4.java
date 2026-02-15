package practice_4;

import java.util.Scanner;

public class BreakContinueZ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stop = "stop";

        System.out.print("Напиши слово stop: ");
        String n = scanner.nextLine();

        while (true) {
            System.out.print("Напиши слово stop: ");
            n = scanner.nextLine();
            if (n.equals(stop)) {
                break;
            }

        }
        System.out.println("Пока");
    }
}
