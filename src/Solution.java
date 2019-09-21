import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        if (n == 0) {
            System.out.print("N/A");
        } else {
            while (n != 0) {
                Books book = new Books(scanner.nextLine(), scanner.nextLine(), scanner.nextLong());
                scanner.nextLine();
                System.out.println("\n-----------------------------\n" + book + "\n-----------------------------\n");
                n--;
            }
        }
    }
}
