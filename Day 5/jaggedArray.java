public class jaggedArray {
    public static void main(String[] args) {
        int x[][] = new int[3][];

        x[0] = new int[3];
        x[1] = new int[4];
        x[2] = new int[2];

        for(int i = 0; i < x.length ; i++){
            for(int j = 0; j < x[i].length; j++){
                x[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i = 0; i < x.length; i++)
        {
            for(int j = 0; j < x[i].length; j++)
            {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int a[] : x) {
            for (int b : a) {
                System.out.print(b + " ");                
            }
            System.out.println();
        }

        System.out.println();

        int y[][][][] = new int [3][4][3][4];
        int counter = 0;
        
        for(int a = 0; a < y.length; a++)
        {
            for (int b = 0; b < y[a].length; b++)
            {
                for (int c = 0; c < y[a][b].length; c++)
                {
                    for (int d = 0; d < y[a][b][c].length; d++)
                    {
                        counter++;
                        y[a][b][c][d] = counter;
                    }
                }
            }
        }

        for(int a = 0; a < y.length; a++)
        {
            for (int b = 0; b < y[a].length; b++)
            {
                for (int c = 0; c < y[a][b].length; c++)
                {
                    for (int d = 0; d < y.length; d++)
                    {
                        System.out.print(y[a][b][c][d] + ",");
                    }
                    System.out.print(" ");
                }
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
