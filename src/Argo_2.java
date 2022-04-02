import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Argo_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = "";

        for (char ch : str.toCharArray()){
            if (Character.isLowerCase(ch)){
               answer += Character.toUpperCase(ch);
            }else answer += Character.toLowerCase(ch);
        }
        System.out.println(answer);
    }
}
