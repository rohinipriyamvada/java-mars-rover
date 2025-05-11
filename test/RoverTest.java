import org.junit.jupiter.api.Test;
import rover.Rover;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    @Test
    void roverTest() {
        String actual = Rover.rover("1 2 N", "L");
        String expected = Arrays.toString(("1 2 W").split(" "));
        assertEquals(expected, actual);
    }

    @Test
    void roverTest2() {
        String actual = Rover.rover("1 2 N", "LLRML");
        String expected = Arrays.toString(("0 2 S").split(" "));
        assertEquals(expected, actual);
    }

    @Test
    void handleMoves() {
        String[] currentPos = new String[]{"1", "2", "N"};
        String[] instructions = new String[]{"L"};

        String actual = Arrays.toString(Rover.handleMoves(currentPos, instructions));
        String expected = Arrays.toString("1 2 W".split(" "));
        assertEquals(expected, actual);
    }
    @Test
    void handleMoves2() {
        String[] currentPos = new String[]{"1", "2", "N"};
        String[] instructions = new String[]{"R", "M", "R", "M", "L"};

        String actual = Arrays.toString(Rover.handleMoves(currentPos, instructions));
        String expected = Arrays.toString("2 1 E".split(" "));
        assertEquals(expected, actual);
    }
}
