public class dssadsadsa {
    public static void main(String[] args) {
        int[][] mas = {{5, 4, 45, 12}, {7, 5, 8, 85},};
        for (int r = 0; r < mas.length; ++r) {
            for (int c = 0; c < mas[r].length; ++c) {
                int number = c + 1;
                for (int number2 = r; number2 < mas.length; ++number2) {
                    while (number < mas[number2].length) {
                        if (mas[number2][number] < mas[r][c]) {
                            int tmp = mas[r][c];
                            mas[r][c] = mas[number2][number];
                            mas[number2][number] = tmp;
                        }
                        ++number;
                    }
                    number = 0;
                }
            }
        }

        for (int i = 0; i < mas.length; ++i) {
            System.out.println(java.util.Arrays.toString(mas[i]));
        }
    }
}

