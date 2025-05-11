package rover;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class calculateRoverPosTest {
    List<String> directionsLeft;
    List<String> directionsRight;


    @BeforeEach
    void init() {
        directionsLeft = Arrays.asList("E", "N", "W", "S");
        directionsRight = Arrays.asList("E", "S", "W", "N");
    }

    @Test
    void turnSouth() {
        String actual = Arrays.toString(calculateRoverPos.turn("3", "3", "W", directionsLeft));
        String actual2 = Arrays.toString(calculateRoverPos.turn("3", "3", "E", directionsRight));
        String expected = Arrays.toString(new String[]{"3", "3", "S"});

        assertEquals(expected, actual);
        assertEquals(expected, actual2);
    }

    @Test
    void turnNorth() {
        String actual = Arrays.toString(calculateRoverPos.turn("3", "3", "E", directionsLeft));
        String actual2 = Arrays.toString(calculateRoverPos.turn("3", "3", "W", directionsRight));
        String expected = Arrays.toString(new String[]{"3", "3", "N"});

        assertEquals(expected, actual);
        assertEquals(expected, actual2);
    }

    @Test
    void turnEast() {
        String actual = Arrays.toString(calculateRoverPos.turn("3", "3", "S", directionsLeft));
        String actual2 = Arrays.toString(calculateRoverPos.turn("3", "3", "N", directionsRight));
        String expected = Arrays.toString(new String[]{"3", "3", "E"});

        assertEquals(expected, actual);
        assertEquals(expected, actual2);
    }

    @Test
    void turnWest() {
        String actual = Arrays.toString(calculateRoverPos.turn("3", "3", "N", directionsLeft));
        String actual2 = Arrays.toString(calculateRoverPos.turn("3", "3", "S", directionsRight));
        String expected = Arrays.toString(new String[]{"3", "3", "W"});

        assertEquals(expected, actual);
        assertEquals(expected, actual2);
    }

    @Test
    void moveSouth() {
        String actual = Arrays.toString(calculateRoverPos.update("3", "3", "S"));
        String expected = Arrays.toString(new String[]{"3", "2", "S"});

        assertEquals(expected, actual);
    }

    @Test
    void moveNorth() {
        String actual = Arrays.toString(calculateRoverPos.update("3", "3", "N"));
        String expected = Arrays.toString(new String[]{"3", "4", "N"});

        assertEquals(expected, actual);
    }

    @Test
    void moveEast() {
        String actual = Arrays.toString(calculateRoverPos.update("3", "3", "E"));
        String expected = Arrays.toString(new String[]{"4", "3", "E"});

        assertEquals(expected, actual);
    }

    @Test
    void moveWest() {
        String actual = Arrays.toString(calculateRoverPos.update("3", "3", "W"));
        String expected = Arrays.toString(new String[]{"2", "3", "W"});

        assertEquals(expected, actual);
    }

    @Test
    void invalidMove() {
        try {
            calculateRoverPos.update("3", "3", "R");
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "Unexpected value: R");
        }
    }
}