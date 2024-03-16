import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class tryFinally {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // int i = 0;
        // int j = 0;
        // int num = 0;
        int num2 = 2;
        // BufferedReader br = null;
        // try {
        //     j = 18/i;

        //     br = new BufferedReader(new InputStreamReader(System.in));
        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
        // }
        // finally {
        //     System.out.println("Bye");
        //     br.close();
        // }

        try (BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in))) {
            num2 = Integer.parseInt(br1.readLine());
            System.out.println(num2);
        }
    }
}
