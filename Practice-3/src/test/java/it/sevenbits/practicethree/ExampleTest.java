package it.sevenbits.practicethree;


import it.sevenbits.practicethree.io.FileReader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExampleTest {
    private Example example;

    @Before
    public void setUp() {
        this.example = new Example();
    }

    @Test
    public void shouldReturnSix() throws IOException {
        FileReader mockReader = mock(FileReader.class);
        when(mockReader.readLine()).thenReturn("Hello!", "Bye!");
        when(mockReader.hasMoreLines()).thenReturn(true, true, false);
        Assert.assertEquals(6, example.getLongestLineCharsCount(mockReader));
    }
    @Test
    public void shouldReturnEleven() throws IOException {
        FileReader mockReader = mock(FileReader.class);
        when(mockReader.readLine()).thenReturn("HP", "Programming");
        when(mockReader.hasMoreLines()).thenReturn(true, true, false);
        Assert.assertEquals(11, example.getLongestLineCharsCount(mockReader));
    }
}
