import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {
    public static int[] readFile(String path) throws IOException {
        List<String> listOfStrings = new ArrayList<String>();
        // Читаем файл
        listOfStrings
                = Files.readAllLines(Paths.get(path));
        String[] array
                = listOfStrings.toArray(new String[0]);
        // переводим в инт, и удаляем не цифры.
        int[] arrayInt = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            try {
                arrayInt[index] = Integer.parseInt(array[i]);
                index++;
            } catch (NumberFormatException nfe) {
            }
        }
        arrayInt = Arrays.copyOf(arrayInt, index);
        return arrayInt;
    }
}
