import java.util.Scanner;

//Q)Print the sum of two numbers entered by the user.

public class BasicSyntax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1,n2,sum;

        System.out.print("Enter number 1: ");
        n1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        n2 = sc.nextInt();

        sum = n1+n2;

        System.out.println("Sum : "+sum);
    }
}
