import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter hamming size: ");
        Scanner scanner = new Scanner(System.in);
        int hammingSize = scanner.nextInt();
        System.out.println(hammingSize);
    }
}