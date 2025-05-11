package rover;

import java.util.Arrays;
import java.util.List;

public enum Instructions {
    L("L"),
    R("R"),
    M("M");

    private final String instruction;

    Instructions(String instr) {
        this.instruction = instr;
    }

    public String[] updatePos(String x, String y, String head) {
        if (this.instruction == "L") {
            List<String> directions = Arrays.asList("N", "W", "S", "E");
            return calculateRoverPos.turn(x, y, head, directions);
        }

        if (this.instruction == "R") {
            List<String> directions = Arrays.asList("N", "E", "S", "W");
            return calculateRoverPos.turn(x, y, head, directions);
        }

        return calculateRoverPos.update(x, y, head);
    }
}
