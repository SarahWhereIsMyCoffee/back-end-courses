package it.sevenbits.practicethree;

import it.sevenbits.practicethree.io.FileReader;
import java.io.IOException;

/**
 * This class makes it possible for us to get the maximum length of the lines in fileReader
 * Contains one method
 */
public class Example {
    private int maxStringLength;
    private String currentLine;

    /**
     * This function returns the biggest value of lines, that we take from the fileReader
     *
     * @param fileReader - passes to the function for the line reading.
     * @return - max line length
     * @throws IOException - in case of read error
     */
    public int getLongestLineCharsCount(final FileReader fileReader) throws IOException {
        while (fileReader.hasMoreLines()) {
            currentLine = fileReader.readLine();
            if (currentLine.length() > maxStringLength) {
                maxStringLength = currentLine.length();
            }
        }

        return maxStringLength;
    }
}
