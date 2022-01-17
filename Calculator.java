import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        int sub;
        int mul;
        float div;
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Please select Operation to perform:");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                        sum = num1 + num2;
                        System.out.println("Addition is " + sum);
                        break;
            case 2:
                        sub = num1 - num2;
                        System.out.println("Subtraction is " + sub);
                        break;
            case 3:
                            mul = num1 * num2;
                            System.out.println("Multiplication is " + mul);
                            break;
            case 4:
                       div = num1 / num2;
                       System.out.println("Division is " + div);
                       break;
              default:
                       System.out.println("Invalid input");                                        
        }
    }
}
