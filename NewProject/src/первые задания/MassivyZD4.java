public class MassivyZD4 {

    public static void main(String[] args) {
        double SumMas1 = 0;
        double SumMas2 = 0;
        int[] mas1 = new int[5];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) ((Math.random() * 10));
            System.out.print(+mas1[i] + "");
            SumMas1 += (double) mas1[i] / mas1.length;
        }
        System.out.println(" ");
        System.out.println(SumMas1);
        int[] mas2 = new int[5];
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = (int) (Math.random() * 10);
            System.out.print(+mas2[i] + "");
            SumMas2 += (double) mas2[i] / mas2.length;
        }
        System.out.println("");
        System.out.println(SumMas2);
        if (SumMas1 == SumMas2) {
            System.out.println("Средние арифметические значения двух массивов равны");
        } else if (SumMas1 > SumMas2) {
            System.out.println("Среднее арифметическое значение первого массива больше второго ");
        } else {
            System.out.println("Среднее арифметическое значение второго массива больше первого ");
        }


    }
}


