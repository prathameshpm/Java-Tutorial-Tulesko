public class throwEx {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if(j == 0) {
                throw new ArithmeticException("I dont want answer Zero...");
            }
        }
        catch(ArithmeticException ex) {
            j = 18 / 1;
            System.out.println("Dont like answer Zero, so I divided by 1. " + ex);
        }
        catch(Exception ex) {
            System.out.println(ex);
        }

        System.out.println(j);
        System.out.println("Bye!!!");
    }
}
