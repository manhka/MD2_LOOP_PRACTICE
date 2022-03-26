import java.util.Scanner;

public class Interest_Caculator {
    public static void main(String[] args) {
        System.out.print("Enter the money that you wanna invest:");
        Scanner scanner=new Scanner(System.in);
        double money= scanner.nextDouble();
        System.out.print("How long(month) :");
        int month =scanner.nextInt();
        double interestRate=0.1;
        double totalInterest= 0;
        for (int i = 1; i < month; i++) {
            totalInterest+= (money*interestRate/12)*month;
        }
        System.out.println(totalInterest+" VND is the interest money you receive after "+ month+" month");
    }
}
