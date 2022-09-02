public class TwoDimArray {
    public static void main(String[] args) {
        int [][] arr2d ={
                {11,22,33,44,55},
                {22,21,32,44,61},
                {12,13,14,14,16}

        };
        int sum;
        for(int i=0;i<3;i++) {
            sum = 0;
            for (int j = 0; j < 5; j++) {
                sum = sum + arr2d[i][j];
            }
            System.out.println(sum);
        }


    }







}
