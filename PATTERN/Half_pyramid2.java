public class Half_pyramid2 {
    public static void main(String[] args) {
        int n = 4;
        //outer loop for rows
        for(int i = 1; i <= n; i++){
            //1st inner loop to print spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //2nd inner loop to print star
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
