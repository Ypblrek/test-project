import java.util.Scanner;

public class MassivyZD5 {
    public static void main(String[] args) {
        int n = 0;
        int g = 0;
        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите число большее 5 ");
            if (scn.hasNextInt()) {
                n = scn.nextInt();
            } else System.out.println("Ошибка. Вы ввели не число!");
        }
        while (n < 5);
        int[] Mas1 = new int[n];
        for (int i = 0; i < Mas1.length; i++) {
            Mas1[i] = (int) (Math.random() * (n + 1));
            System.out.print(Mas1[i] + " ");
            if (Mas1[i] % 2 == 0 & Mas1[i] != 0) {
                g++;
            }
        }
        System.out.println("");
        if (g > 0) {
            int[] Mas2 = new int[g];
            for (int i = 0, b = 0; i < Mas1.length; i++) {
                if (Mas1[i] % 2 == 0 & Mas1[i] != 0) {
                    Mas2[b] = Mas1[i];
                    System.out.print(Mas2[b] + " ");
                }
            }
        }
    }
}


