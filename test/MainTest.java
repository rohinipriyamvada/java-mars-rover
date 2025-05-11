import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void splitInput() {
        String input = "5 5\n1 2 N\nL";
        String expected = Arrays.toString(new String[]{"5 5", "1 2 N", "L"});
        String actual = Arrays.toString(Main.splitInput(input));
        assertEquals(expected, actual);
    }
}