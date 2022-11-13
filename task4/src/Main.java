import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path");
        int[] array = Utils.readFile(sc.nextLine());
        // Вывод полученного массива
        // System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        int mid = (array.length)/2;
        int count = 0;

        for (int a: array){
            count += Math.abs(a - array[mid]);
        }
        System.out.println(count);
    }
}