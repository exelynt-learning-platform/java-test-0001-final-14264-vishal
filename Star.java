public class Star {

    // Height of the hollow diamond pattern
    private static final int PATTERN_HEIGHT = 5;

    public static void main(String[] args) {

        // upper half
        for (int i = 1; i <= PATTERN_HEIGHT; i++) {
            printRow(i);
        }

        // lower half
        for (int i = PATTERN_HEIGHT - 1; i >= 1; i--) {
            printRow(i);
        }
    }

    // prints a single row of the hollow diamond
    private static void printRow(int row) {

        // leading spaces to center the pattern
        for (int s = 1; s <= PATTERN_HEIGHT - row; s++) {
            System.out.print(" ");
        }

        System.out.print("*");

        // inner hollow spaces
        if (row > 1) {
            for (int sp = 1; sp <= (2 * row - 3); sp++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }

        System.out.println();
    }
}