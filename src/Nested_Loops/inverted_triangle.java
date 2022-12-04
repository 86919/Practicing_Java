package Nested_Loops;

public class inverted_triangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int s = 1; s <= i; s++) { // For spaces
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
