public class java_25_multiD_Array {
    public static void main(String[] args) {
        int nums [][] = new int [3][4];
        int random = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j]  = (int)(Math.random() * 10);
                //*10 coz Math.random generates decimal points less than 1
                // and type casting is done to convert double value to integer
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
