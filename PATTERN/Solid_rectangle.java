public class Solid_rectangle{
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        // outter loop for row.
        for(int i = 1; i <= a; i++){
            //inner loop fpr coloumn.
            for(int j = 1; j <= b; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}