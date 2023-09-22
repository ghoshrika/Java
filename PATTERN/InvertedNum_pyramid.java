public class InvertedNum_pyramid {
    public static void main(String[] args) {
         int a = 5;
        //outer loop for rows
        for(int i = 1; i <= a; i++){
            //inner loop
            for(int j = 1; j <= a-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
