public class Star {

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

    // method to print a single row
    private static void printRow(int i) {

        for (int s = 1; s <= PATTERN_HEIGHT - i; s++) {
            System.out.print(" ");
        }

        System.out.print("*");

        if (i > 1) {
            for (int sp = 1; sp <= (2 * i - 3); sp++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }

        System.out.println();
    }
}