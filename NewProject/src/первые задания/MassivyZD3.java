import java.util.Scanner;

public class MassivyZD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите размер массива");
        int Youmassiv = sc.nextInt();
        int[] array = new int[Youmassiv];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 30));
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("max : " + max);
        System.out.println("min : " + min);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        sum /= array.length;
        System.out.println("—реднее : " + sum);
    }

}

