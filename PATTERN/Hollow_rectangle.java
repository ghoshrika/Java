public class Hollow_rectangle {
    public static void main(String[] args) {
        int m = 4;
        int n = 5;
        // outer loop for row.
        for(int i = 1; i <= m; i++){
            // inner loop for coloumn.
            for(int j = 1; j <= n; j++){
                // print star where i,j value is 1 and max(m,n) 
                //otherwise print blank space.
                if(i == 1 || j == 1 || i == m || j == n){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
