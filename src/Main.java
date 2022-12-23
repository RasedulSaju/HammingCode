import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Example: 3 for 7, 4 \n 4 for 15, 11 \n 5 for 31, 26 \n 6 for 63, 57");
        System.out.println("Enter hamming value, value of r: ");

        // Get input for hamming value, r
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();

        // Calculate Block Length
        int l = (int) Math.pow(2, r) - 1;

        // Calculate Message Length
        int m = l - r;

        // Calculate Array Size & Create array
        int arrSize = l+r;
        int[] hamming = new int[arrSize];


        System.out.println("You entered: " + r + ". So, selected hamming is " + l + ", " + m);

        // Generate random message
        for (int i = 0; i < arrSize; i++) {
            Random randNum = new Random();
            hamming[i] = randNum.nextInt(2);
            System.out.print(hamming[i]);
        }


//        for (int i = 0; i < arrSize; i++) {
//            Random randNum = new Random();
//            if(i==0){
//                hamming[i] = randNum.nextInt(2);
//            }
//            else{
//                int j=i;
//                while (j!=1){
//                    if(j%2!=0){
//                        hamming[i] = randNum.nextInt(2);
//                        j/=2;
//                    }
//                }
//                hamming[i] = 0;
//            }
//            System.out.print(hamming[i]);
//        }


    }
}