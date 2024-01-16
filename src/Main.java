import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double num_1, num_2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");

        num_1 = sc.nextDouble();
        num_2 = sc.nextDouble();

        System.out.println("Enter the Operator(+,-,*,/):");

        char operation = sc.next().charAt(0);
        double result = 0;

        switch (operation) {
            case '+':
                result = num_1 + num_2;
                break;
            case '-':
                result = num_1 - num_2;
                break;
            case '*':
                result = num_1 * num_2;
                break;
            case '/':
                result = num_1 / num_2;
                break;

            default:
                System.out.println("You enter wrong input");
        }
        System.out.println("The final result:");


        System.out.println(num_1 + " " + operation + " " + num_2
                + " = " + result);
    }
}