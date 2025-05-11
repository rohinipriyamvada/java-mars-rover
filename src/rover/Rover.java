package rover;

import java.util.Arrays;

public class Rover {
    public static String rover(String roverPos, String roverMoves) {
        String[] instructions = roverMoves.split("");
        String[] roverPosArray = roverPos.split(" ");

        return Arrays.toString(Rover.handleMoves(roverPosArray, instructions));
    }


    public static String[] handleMoves(String[] currentPos, String[] instructions) {
        String x = currentPos[0];
        String y = currentPos[1];
        String head = currentPos[2];

        for (String instruction : instructions) {
            String[] updatedPos = Instructions.valueOf(instruction).updatePos(x, y, head);
            x = updatedPos[0];
            y = updatedPos[1];
            head = updatedPos[2];
        }

        return new String[]{x, y, head};
    }
}
