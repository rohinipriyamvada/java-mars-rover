import rover.Rover;

public class Main {
    public static void main(String[] args) {
        String input = "5 5\n1 2 N\nL";
        String[] inputData = Main.splitInput(input);
        String gridPos = inputData[0];

        String firstRovPos = inputData[1];
        String firstRovMoves = inputData[2];
        //partition the rest of the rovers
        System.out.println(Rover.rover(firstRovPos, firstRovMoves));
    }

    public static String[] splitInput(String input) {
        return (input.split("\n"));
    }
}
