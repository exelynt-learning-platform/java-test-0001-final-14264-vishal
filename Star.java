public class Star {

    public static void main(String[] args) {

        int n = 5;

        // upper half
        for (int i = 1; i <= n; i++) {

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

            System.out.println();
        }

        // lower half
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

            System.out.println();
        }
    }
}