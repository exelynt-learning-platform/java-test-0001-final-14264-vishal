public class Star {
            private static final int PATTERN_HEIGHT = 5; // height of Star Pattern

    public static void main(String[] args) {

 
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