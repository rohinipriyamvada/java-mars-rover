import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void roverTest() {
        String input = "5 5\n1 2 N\nL";
        String expected = "1 2 W";
        String actual = Main.rover(input);
        assertEquals(expected, actual);
    }
}