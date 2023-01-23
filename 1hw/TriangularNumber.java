import java.util.Scanner;

public class TriangularNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int triangularNumber = (n * (n + 1)) / 2;
        System.out.println("Triangular number " + n + " is " + triangularNumber);
    }
}