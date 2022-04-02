import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Argo_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = br.read();
        String[] str = new String[n];
        String reverse = "";

        for (int i = 0; i < n; i++){
            String x = new StringBuilder(i).reverse().toString();

        }
        System.out.println(reverse);
    }
}
