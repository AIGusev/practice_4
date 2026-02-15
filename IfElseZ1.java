package practice_4;

import java.util.Scanner;

public class IfElseZ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Назови мне число: ");
        n = scanner.nextInt();

        if (n > 0) {
            System.out.println("Число положительное");
        } else if (n < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

}
