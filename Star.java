public class Star {
    // default pattern height (avoid magic number; can be overridden via args)
    private static final int PATTERN_HEIGHT = 5;

    public static void main(String[] args) {
        // allow optional command-line override: `java Star 7`
        int n = PATTERN_HEIGHT;
        if (args.length > 0) {
            try {
                int parsed = Integer.parseInt(args[0]);
                if (parsed > 0) n = parsed;
            } catch (NumberFormatException ignored) {
                // keep default if parse fails
            }
        }

        // upper half
        for (int i = 1; i <= n; i++) {
            printRow(i, n);
        }

        // lower half
        for (int i = n - 1; i >= 1; i--) {
            printRow(i, n);
        }
    }

    // prints a single row of the hollow diamond for given row and total height
    private static void printRow(int row, int n) {
        // leading spaces to center the pattern
        for (int s = 1; s <= n - row; s++) {
            System.out.print(" ");
        }

        System.out.print("*");

        // inner spaces to create the hollow look
        if (row > 1) {
            for (int sp = 1; sp <= (2 * row - 3); sp++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }

        System.out.println();
    }
}