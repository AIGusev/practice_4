package practice_4;

import java.util.Scanner;

public class WhileZ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Напиши число: ");
        int n = scanner.nextInt();
        int result = 1;
        int i = 1;

        while (i <= n) {
            result = result * i;
            i++;
        }
        System.out.println(result);
    }
}
