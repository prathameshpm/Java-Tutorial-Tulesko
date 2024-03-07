public class multiDimensionalArray {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int x[][] = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                x[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int a[] : x)
        {
            for(int b : a)
            {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
