public class Test {
    public static void main(String[] args) {
        int[][] a = {{2, 6},
                {3, 7},
                {4, 8},
                {5, 9}};

        int x = a.length;
        int y = a[0].length;
        for (int j = 0; j < y; j++) {
            for (int[] ints : a) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}