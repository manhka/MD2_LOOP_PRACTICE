import java.util.Scanner;

public class Check_prime {
    public static void main(String[] args) {
        System.out.print("enter your number:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if (number<2){
            System.out.println( number+" is not a prime.");
        }
        if (number==2){
            System.out.println(number+" is a prime.");
        }
        for (int i = 2; i <number ; i++) {
            if (number%i==0){
                System.out.println(number+" is not a prime.");
                break;
            }else {
                System.out.println(number+" is a prime.");
                break;
            }
        }
    }
}
