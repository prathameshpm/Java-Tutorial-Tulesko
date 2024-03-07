public class array {

    /**
     * @param args
     */
    public static void main(String[] args) {
        char x[] = {'a', 'b', 'c', 'd'};
        int y[] = {0, 1, 3, 7};
        System.out.println(x[1]);

        int z[] = new int[4];
        z[0] = 12;
        z[1] = 47;
        z[2] = 11;
        z[3] = 99;
        System.out.println(z);

        for(int i = 0; i < 4 ; i++){
            System.out.println("z[" + i + "] = " + z[i]);
        }

        int n = 9;
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = i + 1;
        }

        System.out.print("Array a[] = {");
        for(int i = 0; i < n - 1; i++){
            System.out.print(a[i] + ",");
        }
        for(int i = n - 1; i < n; i++){
            System.out.print(a[i]);
        }
        System.out.print("}");
    }
}