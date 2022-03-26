import java.util.Scanner;

public class Great_common_factor {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1= scanner.nextInt();
        System.out.print("Enter the second number:");
        int num2= scanner.nextInt();
        if (num1==0||num2==0){
            System.out.println("NO great common factor");
        }
        while (num1!=num2){
            if (num1>num2){
                num1=num1-num2;
            }else {
                num2=num2-num1;
            }
        }
        System.out.println(num1+" is the Great common factor");
    }
}
