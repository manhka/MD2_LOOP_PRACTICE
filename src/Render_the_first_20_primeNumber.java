import java.util.Scanner;

public class Render_the_first_20_primeNumber {
    public static void main(String[] args) {
        System.out.print("enter a big number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        if (number < 2) {
            System.out.println(number + " is not a prime");
            return;
        }
        for (int i = 2; count <= number; i++) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                ++count;
                System.out.println(i + " is a prime");
                if (count == 20) {
                    break;
                }
            }
        }
    }
}

