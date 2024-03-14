class PrathameshException extends Exception {
    public PrathameshException(String string) {
        super(string);
    }
}

public class customEx {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        try {
            j = 5 / i;
            if (j == 0) {
                throw new PrathameshException("I dont want answer Zero...");
            }
        } catch (PrathameshException e) {
            j = 5 / 1;
            System.out.println("Dont like answer Zero, so I divided by 1. " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }

        System.out.println(j);
        System.out.println("Bye!!!");
    }
}
