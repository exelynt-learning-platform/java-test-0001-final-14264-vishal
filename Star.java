public class Star {
    public static void main(String[] args) {

        int n = 5; // height of Star Pattern

        // Upper part of Star Pattern
        for (int i = 1; i <= n; i++) {

            // print spaces to center the stars

            for (int s = 1; s <= n - i; s++) {
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
        for (int i = n - 1; i >= 1; i--) {

            for (int s = 1; s <= n - i; s++) {
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