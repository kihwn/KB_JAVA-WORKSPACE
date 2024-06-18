import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        int x,y,result;

        System.out.print("x = ");
        x = Integer.parseInt(br.readLine());

        System.out.println("y = ");
        y = Integer.parseInt(br.readLine());

        result = x+y;

        System.out.printf("%d + %d = %d \n",x,y,result);


        System.out.println("y = ");
    }
}
