import java.util.ArrayList;
import java.util.List;

public class MyMath {
        public static void main(String[] args){
            List<Integer> l=new ArrayList<>();
            l.add(Integer.valueOf(7));
            l.add(Integer.valueOf(6));
            double avg=MaMath.calculateAvg(l);
            System.out.println(avg);
        }
}

