import java.util.*;

public class Calculator {
    public static void main (String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the first and second number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Add Enter 1,Substract Enter 2,Multiply Enter 3,Division Enter 4,Remainder Enter 5");
        int c = sc.nextInt();
        System.out.println("Your Answer is: ");

        switch (c) {
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : System.out.println(a/b);
            break;
            case 5 : System.out.println(a % b);
            break;
            default: System.out.println("Invalid Token");

        }
    }



}
