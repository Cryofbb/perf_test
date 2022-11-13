import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
    List<String> strings = new ArrayList<String>();

    public static List<Float> readFile(String path) {
        //Сделать ввод пути файла
        File file = new File(path);
        List<Float> floats = new ArrayList<Float>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                Float line = sc.nextFloat();
                floats.add(line);
                //System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return floats;
    }
}

