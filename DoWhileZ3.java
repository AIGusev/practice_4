package practice_4;

public class DoWhileZ3 {
    public static void main(String[] args) {
        int i = 1;
        String n = "";

        do {
            n = n + " " + i;
            i++;
        } while (i <= 10);
        System.out.println(n);
    }
}
