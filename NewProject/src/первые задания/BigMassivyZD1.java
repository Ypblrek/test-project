import java.util.Scanner;

public class BigMassivyZD1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] mas = {{{1, 2}, {4, 5}}, {{7, 8}, {10, 11}}, {{13, 14}, {16, 17}}};
        int number = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int h = 0; h < mas[j].length; h++) {
                    System.out.print(mas[i][j][h] + " ");
                }

            }
        }
        System.out.println(" ");
        for (int a = 0; a < mas.length; a++) {
            for (int s = 0; s < mas[a].length; s++) {
                for (int d = 0; d < mas[s].length; d++) {
                    number = sc.nextInt();
                    mas[a][s][d] = mas[a][s][d] + number;
                    System.out.print(mas[a][s][d] + " ");

                }

            }
        }
    }
}
