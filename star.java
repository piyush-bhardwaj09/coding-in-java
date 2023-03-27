public class star{
    public static void main(String[] args) {
        int rows = 8;
        int columns =20;

        for(int i = 1; i <= columns; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
