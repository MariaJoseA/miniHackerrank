import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private String inputText, outputText;
    private byte[] input, output;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @After
    public void assertOutputs() {
        System.setIn(new ByteArrayInputStream(input));
        System.setOut(new PrintStream(outputStream));
        Solution.main(null);
        assertEquals(new String(output), outputStream.toString());
    }

    @Test
    public void testCase0() {
        inputText = "3\n" +
                "([A-Z])(.+)\n" +
                "[AZ[a-z](a-z)\n" +
                "batcatpat(nat";
        outputText = "Valid\n" +
                "Invalid\n" +
                "Invalid\n";
        input = inputText.getBytes();
        output = outputText.getBytes();
    }

}
