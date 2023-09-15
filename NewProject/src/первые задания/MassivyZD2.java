import java.util.Scanner;

public class MassivyZD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] yourArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] tempArray = new int[yourArray.length];
        yourArray = tempArray;
        for (int i : yourArray) {
            System.out.println("ведите число масимав");
            i = sc.nextInt();
            if (i == 0) {
                System.out.println("Число массива " + " " + i + " " + "верное");
                break;
            } else {
                System.out.println("Число массива не верно");
            }

        }
    }
}




