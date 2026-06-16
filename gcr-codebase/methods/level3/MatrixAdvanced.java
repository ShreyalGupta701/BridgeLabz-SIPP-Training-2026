public class MatrixAdvanced {

    static int[][] transpose(
            int[][] matrix) {

        int[][] result =
                new int[matrix[0].length]
                        [matrix.length];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                result[j][i] =
                        matrix[i][j];
            }
        }

        return result;
    }

    static int determinant2x2(
            int[][] matrix) {

        return matrix[0][0]
                * matrix[1][1]
                -
                matrix[0][1]
                        * matrix[1][0];
    }

    static double[][] inverse2x2(
            int[][] matrix) {

        int det =
                determinant2x2(matrix);

        if (det == 0)
            return null;

        double[][] inverse =
                new double[2][2];

        inverse[0][0] =
                matrix[1][1]
                        / (double)det;

        inverse[0][1] =
                -matrix[0][1]
                        / (double)det;

        inverse[1][0] =
                -matrix[1][0]
                        / (double)det;

        inverse[1][1] =
                matrix[0][0]
                        / (double)det;

        return inverse;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {4, 7},
                {2, 6}
        };

        System.out.println(
                "Determinant = "
                        + determinant2x2(matrix));

        double[][] inverse =
                inverse2x2(matrix);

        System.out.println("Inverse");

        for (double[] row : inverse) {

            for (double val : row)
                System.out.printf("%.2f ", val);

            System.out.println();
        }
    }
}