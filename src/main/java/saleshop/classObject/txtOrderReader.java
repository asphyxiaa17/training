package saleshop.classObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class txtOrderReader extends OrderReader {
    private Path path = Path.of("src/main/resources/discount_day.txt");

    @Override

    public List<String> orderlist() {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Файл не найден" + e.getMessage());
        }
        return lines;
    }
}