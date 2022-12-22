import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Example: 3 for 7, 4 /n 4 for 15, 11 /n 5 for 31, 26 /n 6 for 63, 57");
        System.out.println("Enter hamming size, value of r:");

        Scanner scanner = new Scanner(System.in);
        int hammingSize = scanner.nextInt();

        System.out.println(hammingSize);
    }
}