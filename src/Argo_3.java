import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Argo_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String answer = "";
        int max = 0;

        for (String s : str){
             int len = s.length();
             if (len > max){
                 max = len;
                 answer = s;
             }
        }
        System.out.println(answer);
    }
 }
