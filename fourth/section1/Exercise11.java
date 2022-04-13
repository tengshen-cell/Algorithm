package section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise11 {

    public static void main(String[] args) {
        boolean[][] array = {{false, false, true}, {false, true, false}};
        printArray(array);
    }

    private static void printArray(boolean[][] array) {
        for (boolean[] booleans : array) {
            for (boolean aBoolean : booleans) {
                if (aBoolean) {
                    StdOut.print("*");
                } else {
                    StdOut.print(" ");
                }
            }
            StdOut.println();
        }

       /* for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]) {
                    StdOut.print("*");
                } else {
                    StdOut.print(" ");
                }
            }
            StdOut.println();
        }*/
    }
}
