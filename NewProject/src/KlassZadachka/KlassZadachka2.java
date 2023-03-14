package KlassZadachka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KlassZadachka2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            strings.add(sc.nextLine());
        }
        int max = 0;
        int min = 0;
        for(int i = 1; i<4;i++) {
            if (strings.get(max).length() < strings.get(i).length())
                max = i;
        }
            StringBuilder resul = new StringBuilder("");
            resul.append("Max stirings is '").append(strings.get(max)).append("' ");
            resul.append("\n");
            resul.append("Max stirings lenth is").append(strings.get(max).length()).append("'");
            System.out.println(resul);
        }

    }

