public class ifElseConditions{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int x = 8;
        if (x <= 5) {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }

        if(true) {
            System.out.println("Hello_1");
        }

        if(false){
            System.out.println("Hello_2");
        }else{
            System.out.println("Hello_3");
        }

        int y = 10;
        int z = 22;

        if(x>y && x>z){
            System.out.println(x);
        }else if(y>z){
            System.out.println(y);
        }else{
            System.out.println(z);
        }

        int n1 = 4;
        int n2 = 5;
        int result1 = 0;
        int result2 = 0;

        /* if(n%2 == 0)
            result = 10;
        else
            result = 20; */
        
        result1 = n1 % 2 == 0 ? 10 : 20;
        result2 = n2 % 2 == 0 ? 10 : 20;

        System.out.println(result1);
        System.out.println(result2);
    }
}