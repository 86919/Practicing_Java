package Nested_Loops;

public class triangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int s = 4; s >= i; s--) { // For printing spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
