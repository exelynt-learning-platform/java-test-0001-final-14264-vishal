public class Star {
            private static final int PATTERN_HEIGHT = 5; // height of Star Pattern

    public static void main(String[] args) {


        // Upper part of Star Pattern
        for (int i = 1; i <= PATTERN_HEIGHT; i++) {

            
            // print spaces to center the stars

            for (int s = 1; s <= PATTERN_HEIGHT - i; s++) {
                System.out.print(" ");
            }

            System.out.print("*"); // first star

            if (i > 1) {
                for (int sp = 1; sp <= (2 * i - 3); sp++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half of Star Pattern
        for (int i = PATTERN_HEIGHT - 1; i >= 1; i--) {

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

            System.out.println(); // next row
        }
    }
}