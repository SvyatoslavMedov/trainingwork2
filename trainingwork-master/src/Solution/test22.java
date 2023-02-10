package Solution;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test22 {
    public static void main(String[] args) throws Exception {
    // Input files
    List<Path> inputs = Arrays.asList(
            Paths.get("C:\\JavaProject2\\trainingwork\\trainingwork-master\\1.txt"),
            Paths.get("C:\\JavaProject2\\trainingwork\\trainingwork-master\\2.txt"),
            Paths.get("C:\\JavaProject2\\trainingwork\\trainingwork-master\\3.txt")
    );

    // Output file
    Path output = Paths.get("C:\\JavaProject2\\trainingwork\\trainingwork-master\\4.txt");

    // Charset for read and write
    Charset charset = StandardCharsets.UTF_8;

    // Join files (lines)
    for (Path path : inputs) {
        List<String> lines = Files.readAllLines(path, charset);




        Files.write(output, lines, charset, StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }
    List<String> lines2 = Files.readAllLines(output, charset);
    Collections.sort(lines2);

    Files.write(output, lines2, charset, StandardOpenOption.CREATE,
            StandardOpenOption.TRUNCATE_EXISTING);
    }
}
