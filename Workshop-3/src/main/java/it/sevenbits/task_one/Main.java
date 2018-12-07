package it.sevenbits.task_one;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the directory path: ");
        String directoryPath = scanner.nextLine();
        createFile(directoryPath);
    }



    public static void createFile(String directoryPath) throws IOException {
        Stream<Path> pathStream = Files.walk(Paths.get(directoryPath));
        Path[] paths = pathStream.toArray(Path[]::new);

        Path outputhPath = Paths.get("./out.txt");
        Files.deleteIfExists(outputhPath);
        final BufferedWriter bufferedWriter = Files.newBufferedWriter(
                outputhPath, StandardCharsets.UTF_8);

        for (int i = 0; i < paths.length; i++) {
            bufferedWriter.write(paths[i].getFileName().toString());
            bufferedWriter.write(", ");
            bufferedWriter.write(Files.isDirectory(paths[i]) ? "directory" : "file");
            bufferedWriter.write(", ");
            bufferedWriter.write(PosixFilePermissions.toString(Files.getPosixFilePermissions(paths[i])));
            bufferedWriter.write(", ");
            bufferedWriter.write(paths[i].toAbsolutePath().toString());

            if (i % 5 == 0) {
                bufferedWriter.flush();
            }
            bufferedWriter.write("\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
