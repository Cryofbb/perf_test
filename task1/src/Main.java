import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter m:");
        int m = sc.nextInt();
        int index = 1;
        do {
            System.out.print(index);
            index = 1 + (index + m - 2) % n;
        } while (index != 1);
    }
}
