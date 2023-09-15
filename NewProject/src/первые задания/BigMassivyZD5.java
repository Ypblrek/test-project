public class BigMassivyZD5 {
    public static void main(String[] args) {
        int[][] Array =  {{1,3,4},{0,0,1},{0,1,3}};
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                if (i==j) {
                    System.out.print(Array[i][j]);

                }
            }
        }
    }

}

