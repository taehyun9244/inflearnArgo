import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Argo_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char ch[] = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(ch[lt])) lt++;
            else if (!Character.isAlphabetic(ch[rt])) rt--;
            else {
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
        }
        String answer = String.valueOf(ch);
        System.out.println(answer);
    }
}
