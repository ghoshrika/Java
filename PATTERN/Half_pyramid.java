public class Half_pyramid {
    public static void main(String[] args) {
        int m = 4;
        //outer loop for rows
        for(int i = 1; i <= m; i++){
            //inner loop for coloumn
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
