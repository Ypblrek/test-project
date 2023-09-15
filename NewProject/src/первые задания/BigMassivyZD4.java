public class BigMassivyZD4 {

    public static void main(String[] args) {
        int[][] Array = {{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                sum =sum  + Array[i][j];
            }
        }System.out.println(""+sum+"");
    }

}

