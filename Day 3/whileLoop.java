public class whileLoop {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        while (i < 5){
            System.out.println("i = " + i);
            j = 0;
            while (j < 3){
                System.out.println("j = " + j);
                j++;
            }
            System.out.println("Bye i = " + i + " j = " + j);
            i++;
        }
        System.out.println("Bye i = " + i + " j = " + j);

        int x = 0;
        int y = 0;

        do {
            System.out.println("x = " + x);
            y = 0;
            do {
                System.out.println("y = " + y);
                y++;
            } while (y < 3);
            System.out.println("Bye x = " + x + " y = " + y);
            x++;
        } while (x < 5);
        System.out.println("Bye x = " + x + " y = " + y);
    }
}
