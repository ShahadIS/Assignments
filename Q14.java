public class Q14 {
/*
Write a Java method that takes two three-dimensional integer arrays and adds them componentwise.


 */

    public static int[][][] addArrays(int[][][] array1, int[][][] array2) {
        int size1 = array1.length;
        int size2 = array1[0].length;
        int size3 = array1[0][0].length;

        int[][][] result = new int[size1][size2][size3];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                for (int k = 0; k < size3; k++) {
                    result[i][j][k] = array1[i][j][k] + array2[i][j][k];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][][] array1 = { { {1, 2, 3}, {4, 5, 6} }, { {7, 8, 9}, {10, 11, 12} } };
        int[][][] array2 = { { {13, 14, 15}, {16, 17, 18} }, { {19, 20, 21}, {22, 23, 24} } };

        int[][][] result = addArrays(array1, array2);
    }}