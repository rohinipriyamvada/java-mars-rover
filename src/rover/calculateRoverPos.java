package rover;

import java.util.List;

import static java.lang.Integer.parseInt;

public class calculateRoverPos {
    static String[] turn(String x, String y, String head, List<String> directions) {
        int headPos = directions.indexOf(head) + 1;
        String updatedHead = directions.get(headPos % 4);

        return new String[]{x, y, updatedHead};
    }

    static String[] update(String x, String y, String head) {
        switch (head) {
            case "N":
                return new String[]{x, String.valueOf(parseInt(y) + 1), head};
            case "E":
                return new String[]{String.valueOf(parseInt(x) + 1), y, head};
            case "W":
                return new String[]{String.valueOf(parseInt(x) - 1), y, head};
            case "S":
                return new String[]{x, String.valueOf(parseInt(y) - 1), head};
            default:
                throw new IllegalStateException("Unexpected value: " + head);
        }

    }
}
