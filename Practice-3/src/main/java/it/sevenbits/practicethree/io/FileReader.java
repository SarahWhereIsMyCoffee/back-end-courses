package it.sevenbits.practicethree.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * FileReader class has a two methods, one of which return the next line of the file,
 * so other checks, if it possible
 */
public class FileReader {
    private boolean hasMoreLines;
    private final InputStreamReader inputStreamReader;
    private int lineIndex;
    private final File file;

    /**
     * Constructor of the FileReader class. Has two methods.
     *
     * @param file - passes to the function and reads by it
     * @throws FileNotFoundException - exception in case of error of finding of the file
     */
    public FileReader(final File file) throws FileNotFoundException {
        this.file = file;

        inputStreamReader = new InputStreamReader(
                            new BufferedInputStream(
                            new FileInputStream(file)), StandardCharsets.UTF_8);
        lineIndex = 1;
        hasMoreLines = true;
    }

    /**
     * This method takes one line (string) from the InputStreamReader and returns this line
     *
     * @return - read line
     * @throws IOException - in case of read error
     */
    public String readLine() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file.getName()).append(" line ").append(lineIndex).append(": ");

        int currentChar = inputStreamReader.read();

        while (currentChar != -1 && currentChar != '\n') {
            stringBuilder.append((char) currentChar);
            currentChar = inputStreamReader.read();
        }

        if (currentChar == -1) {
            hasMoreLines = false;
        } else {
            lineIndex++;
        }

        return stringBuilder.toString();
    }

    /**
     * This method checks if the file has a next line
     *
     * @return - boolean variable: true if file has a next line, false in different case.
     */
    public boolean hasMoreLines() {
        return hasMoreLines;
    }
}
