package Nested_Loops;

public class diagonal_A {
    public static void main(String[] args) {
        // Star Pyramid pattern
//        for (int i = 1; i <= 5; i++) {
//            for (int s = 5; s >= i; s--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j < (i*2); j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= 5; i++) {
            for (int s = 5; s >= i; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j < (i*2); j++) {
                if (j > 1 && j < (i*2)-1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
