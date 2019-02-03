package other;

public class ChristmasTree {
    public static void main(String[] args) {
        printTree();
        printTrunk();
    }

    private static void printTree() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printTrunk() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8 ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 4; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
