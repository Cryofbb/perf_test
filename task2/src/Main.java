import java.util.List;
import java.util.Scanner;

public class Main {
    static float cx;
    static float cy;
    static float r;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first file path");
        List<Float> coords = Utils.readFile(sc.nextLine());
        System.out.println("Enter second file path");
        List<Float> points = Utils.readFile(sc.nextLine());
        // Ввод координат х из файла
        cx = coords.get(0);
        // Ввод координат у из файла
        cy = coords.get(1);
        // Ввод радиуса r из файла
        r = coords.get(2);
        // Вывод координат и радиуса
        //System.out.println("X "+cx+" Y "+cy+" R "+r);
        for (int i = 0; i < (points.size() - 1); i = i + 2) {
            // Вывод координат точки
            //System.out.println("Точка "+points.get(i)+" "+points.get(i+1));
            checkInCircle(points.get(i), points.get(i + 1));
        }

    }

    private static void checkInCircle(Float x, Float y) {
        int l = (int) Math.sqrt(Math.pow(Math.abs(cx - x), 2) + Math.pow(Math.abs(cy - y), 2));
        if (l > r) {
            // Точка находится вне окружности
            System.out.println(2);
        } else if (l == r) {
            // Точка находится на окружности
            System.out.println(0);
        } else {
            // Точка находится в окружности"
            System.out.println(1);
        }
    }
}