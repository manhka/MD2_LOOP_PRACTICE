import java.util.Scanner;

public class Render_thePrime_lower_than_100 {
    public static void main(String[] args) {
        System.out.print("Enter a big number: " );
        Scanner  scanner= new Scanner(System.in);
        int number= scanner.nextInt();
        int count=0;
        for (int i = 2; i < 100 ; i++) {
            boolean check=true;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    check=false;
                    break;
                }
            }
            if (check){
                System.out.println(i+" is a prime that < 100");
                count++;

            }
        }System.out.println("the number of prime that <100 is: "+ count);
    }
}
