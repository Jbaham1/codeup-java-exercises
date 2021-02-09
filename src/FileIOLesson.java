import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileIOLesson {
    public static void main(String[] args) throws IOException {
        String filename = "languages.txt";
        Path dataFile = Paths.get(filename);

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }
        List<String> languages = Arrays.asList("HTML", "JavaScript", "CSS", "Java");
        Path filepath = Paths.get("languages.txt");
        Files.write(filepath, languages);
//whats the difference between ArrayList<String> and Arrays.asList
    }
}
