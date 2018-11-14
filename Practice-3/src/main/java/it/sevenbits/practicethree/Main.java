package it.sevenbits.practicethree;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import java.nio.charset.StandardCharsets;

/**
 * Main class contains only main method, where i made a program
 */
public final class Main {
    /**
     * Takes all the strings from first .txt file, after this creates the second .txt file
     * and put there our taken strings. Also its writes my surname in the end of second file.
     *
     * @param args - Command line arguments
     */
    public static void main(final String[] args) {
        final File inputFile = new File("./Homework3.txt");
        StringBuilder stringBuilder = new StringBuilder();

        try (final Reader inputStreamReader = new InputStreamReader(
                new BufferedInputStream(new FileInputStream(inputFile)),
                StandardCharsets.UTF_8)
        ) {
            int character;
            while ((character = inputStreamReader.read()) != -1) {
                stringBuilder.append((char) character);
            }
        } catch (final FileNotFoundException e) {
            e.printStackTrace();
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        File outputFile = new File("./MyHomework.txt");
        try {
            outputFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStream surnameInputStream = new InputStream() {
            private final String surnameString = "Саттаров";
            private final byte[] surname = surnameString.getBytes(StandardCharsets.UTF_8);
            private int i = 0;

            @Override
            public int read() {
                if (i < surname.length) {
                    final byte current = surname[i];
                    i++;
                    return current;
                } else {
                    return -1;
                }
            }
        };

        final byte[] data = stringBuilder.toString().getBytes(StandardCharsets.UTF_8);
        try (final OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFile))) {
            outputStream.write(data);
            int character = surnameInputStream.read();
            while (character != -1) {
                outputStream.write((char) character);
                character = surnameInputStream.read();
            }
            outputStream.flush();
        } catch (final FileNotFoundException e) {
            e.printStackTrace();
            return;
        } catch (final IOException e) {
            e.printStackTrace();
            return;
        }
    }
    private Main() {}
}
