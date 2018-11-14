package it.sevenbits.practicethree.io;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
/**
 * Simple test for the FileReader class
 * It creates file (./Homework3.txt) and takes from this file the forth line.
 * After this the program complains two lines.
 */
public class FileReaderTest {
    private FileReader fileReader;

    @Before
    public void setUp() {
        File file = new File("./Homework3.txt");
        try {
            this.fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Test() throws IOException {
        String currentLine = null;
        while (fileReader.hasMoreLines()) {
            currentLine = fileReader.readLine();
        }
        String lineShouldBe = "Homework3.txt line 4: А ларчик просто открывался";
        assertEquals(lineShouldBe, currentLine);
    }
}
