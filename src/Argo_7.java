import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Argo_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.toUpperCase();
        String answer = "YES";

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                answer = "NO";
            }
        }
        System.out.println(answer);
    }
}

