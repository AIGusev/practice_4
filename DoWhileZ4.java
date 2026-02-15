package practice_4;

import java.util.Scanner;

public class DoWhileZ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exit = "exit";
        String n;

        do {
            System.out.print("Введи команду exit: ");
            n = scanner.nextLine();
            } while (!n.equals(exit));

            System.out.println("Молодец");

        }
    }

