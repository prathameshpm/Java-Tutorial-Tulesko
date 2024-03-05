public class forLoop {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        for(i = 0 ; i < 7 ; i++){
            System.out.println("Day " + (i + 1));
            for(j = 0 ; j < 9 ; j++){
                System.out.println("    " + (j + 9) + " - " + (j + 10));
            }
        }
    }    
}
