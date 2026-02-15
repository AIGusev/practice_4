package practice_4;

import java.util.Scanner;

public class SwitchZ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, c;
        char b;

        System.out.print("Напишите первое число: ");
        a = scanner.nextInt();
        System.out.print("Напишите оператор +, -, *, /: ");
        b = scanner.next().charAt(0);
        System.out.print("Напишите второе число: ");
        c = scanner.nextInt();

        switch (b) {
            case '+':
                System.out.println(a + " + " + c + " = " + (a + c));
                break;
            case '-':
                System.out.println(a + " - " + c + " = " + (a - c));
                break;
            case '*':
                System.out.println(a + " * " + c + " = " + (a * c));
                break;
            case '/':
                if (c != 0) {
                System.out.println(a + " / " + c + " = " + (a / c));
                } else {
                    System.out.println("Делить на 0 нельзя");}
                break;
            default:
                System.out.println("Неизвестный оператор");
                break;
        }
    }
}
